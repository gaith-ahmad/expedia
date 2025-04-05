import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { ApplicationConfigService } from 'app/core/config/application-config.service';
import { Observable } from 'rxjs';
import { Root } from '../DTO/dto';

@Injectable({
  providedIn: 'root'
})
export class ExpediaOffersService {
  protected resourceUrl: string;

  // Constructor injection
  constructor(
    private readonly http: HttpClient, 
    private readonly applicationConfigService: ApplicationConfigService
  ) {
    // Setting the resource URL in the constructor
    this.resourceUrl = this.applicationConfigService.getEndpointFor('api/expedia');
  }
  
  getOriginCities(): Observable<string[]> {
    return this.http.get<string[]>(`${this.resourceUrl}/origin`);
  }

  // Method to fetch destination cities
  getDestinationCities(): Observable<string[]> {
    return this.http.get<string[]>(`${this.resourceUrl}/destination`);
  }
  getPackage(origin: string, destination: string): Observable<Root> {
    const params = new HttpParams()
      .set('origin', origin)
      .set('destination', destination);

    return this.http.get<any>(`${this.resourceUrl}/package`, { params });
  }
  
 }
