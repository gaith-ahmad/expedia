import { Component, OnDestroy, OnInit, inject, signal } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { Subject } from 'rxjs';
import { takeUntil } from 'rxjs/operators';

import SharedModule from 'app/shared/shared.module';
import { AccountService } from 'app/core/auth/account.service';
import { Account } from 'app/core/auth/account.model';
import { ExpediaOffersService } from './service/expedia-offers.service';
import { FormsModule } from '@angular/forms';
import { Root } from './DTO/dto';

@Component({
  selector: 'jhi-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
  imports: [SharedModule, RouterModule,FormsModule],
})
export default class HomeComponent implements OnInit, OnDestroy {
  account = signal<Account | null>(null);

  private readonly destroy$ = new Subject<void>();

  private readonly accountService = inject(AccountService);
  private readonly router = inject(Router);
  

  constructor(private expediaService:ExpediaOffersService){

  }
  originCities: string[] = [];
  selectedOriginCity: string = '';

 
  destinationCities: string[] = [];
  selectedDestinationCity: string ='';


  package!:Root

  
  ngOnInit(): void {
  this.expediaService.getOriginCities().subscribe(data=>this.originCities=data);
  this.expediaService.getDestinationCities().subscribe(data=>this.destinationCities=data);
  }

  search():void {
    this.expediaService.getPackage(this.selectedOriginCity,this.selectedDestinationCity).subscribe(data=>
      this.package=data
    );
  }

  ngOnDestroy(): void {
    
  }
}
