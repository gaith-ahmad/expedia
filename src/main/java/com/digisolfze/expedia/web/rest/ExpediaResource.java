package com.digisolfze.expedia.web.rest;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digisolfze.expedia.dto.Expedia;
import com.digisolfze.expedia.service.ExpediaService;

@RestController
@RequestMapping("/api/expedia")
public class ExpediaResource {

    @Autowired
    private ExpediaService expediaService;

    @GetMapping("/origin")
    public Set<String> getOriginCites() {
        return expediaService.getOriginCites();
    }

    @GetMapping("/destination")
    public Set<String> getDestinationCites() {
        return expediaService.getDestinationCites();
    }
    @GetMapping("/package")
    public  ResponseEntity<Expedia> getPackage(@RequestParam("origin")String origin,@RequestParam("destination")String destination) {
        return expediaService.getPackage(origin, destination);
    }
    
}
