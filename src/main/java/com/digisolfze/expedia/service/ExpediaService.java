package com.digisolfze.expedia.service;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.digisolfze.expedia.dto.Expedia;

@Service
public class ExpediaService {

	private String baseUrl = "https://offersvc.expedia.com/offers/v2/getOffers";
	private ResponseEntity<Expedia> responseEntity;

	@Scheduled(cron = "* * * * * ?", zone = "Europe/Paris")
	public ResponseEntity<Expedia> get() {
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl).queryParam("scenario", "deal-finder")
				.queryParam("page", "foo").queryParam("uid", "test").queryParam("productType", "Package")
				.queryParam("clientId", "test").build().toUri();
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters()
				.add(new org.springframework.http.converter.StringHttpMessageConverter(StandardCharsets.UTF_8));

		HttpHeaders headers = new HttpHeaders();

		HttpEntity<Expedia> entity = new HttpEntity<>(headers);
		ResponseEntity<Expedia> response = null;
		try {
			response = restTemplate.exchange(uri, HttpMethod.GET, entity, Expedia.class);
		} catch (Exception e) {
			System.err.println("Request failed: " + e.getMessage());
		}
		responseEntity=response;
		return response;
	}
	public Set<String> getOriginCites() {
		return responseEntity.getBody().getOffers().getPackage().stream().map(f -> f.getOrigin().getCity())
				.collect(Collectors.toSet());
	}
	public Set<String> getDestinationCites() {
		return responseEntity.getBody().getOffers().getPackage().stream().map(f -> f.getDestination().getCity())
				.collect(Collectors.toSet());
	}
	public ResponseEntity<Expedia> getPackage(String origin,String destination) {
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl).queryParam("scenario", "deal-finder")
				.queryParam("page", "foo").queryParam("uid", "test").queryParam("productType", "Package")
				.queryParam("OriginCity", origin)
				.queryParam("DestinationCity",destination)
				.queryParam("clientId", "test").build().toUri();
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters()
				.add(new org.springframework.http.converter.StringHttpMessageConverter(StandardCharsets.UTF_8));

		HttpHeaders headers = new HttpHeaders();

		HttpEntity<Expedia> entity = new HttpEntity<>(headers);
		ResponseEntity<Expedia> response = null;
		try {
			response = restTemplate.exchange(uri, HttpMethod.GET, entity, Expedia.class);
		} catch (Exception e) {
			System.err.println("Request failed: " + e.getMessage());
		}
		return response;
	}
}
