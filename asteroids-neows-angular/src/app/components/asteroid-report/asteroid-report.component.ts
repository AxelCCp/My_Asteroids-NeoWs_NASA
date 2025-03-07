import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { AsteroidDto } from '../../models/AsteroidDto';
import { AsteroidService } from '../../services/Asteroid.service';
import { Router, RouterLink } from '@angular/router';
import { SentryDataComponent } from '../sentry-data/sentry-data.component';
import { SentryData } from '../../models/SentryData';

@Component({
  selector: 'asteroid-report',
  standalone: true,
  imports: [RouterLink, SentryDataComponent],
  templateUrl: './asteroid-report.component.html',
  styleUrl: './asteroid-report.component.css'
})
export class AsteroidReportComponent implements OnInit {

  asteroidDtoList : AsteroidDto[] = [];

  open : boolean = false;

  constructor(private router : Router, private asteroidService : AsteroidService ){

    if(this.router.getCurrentNavigation()?.extras.state) {

      this.asteroidDtoList = this.router.getCurrentNavigation()?.extras.state!['asteroidDtoList'];

    }

  }


  ngOnInit() : void {

    if(this.asteroidDtoList == undefined || this.asteroidDtoList == null || this.asteroidDtoList.length == 0 ) {
      
      console.log('consulta - findAll - AsteroidReportComponent')
      
      this.asteroidService.findAll().subscribe(asteroidDtoList => this.asteroidDtoList = asteroidDtoList);

    }
    
  }

  @Output() selectedSentryDataEventEmitter = new EventEmitter();

  sentry_data_selected! : SentryData;

  onOpenSentryData(sentry_data_url : string) {

    //realizar llamada al back con  sentr_data
    this.sentry_data_selected = new SentryData();

    this.asteroidService.getSentryData(sentry_data_url).subscribe(sentry_data => this.sentry_data_selected = sentry_data);

    //emitir obj sentry_data
    this.selectedSentryDataEventEmitter.emit(this.sentry_data_selected);

    console.log('this.sentry_data: ' + this.sentry_data_selected.Palermo_scale_max);

    this.open = true;                                       
  }

  onCloseSentryData() {
    console.log("onCloseSentryData")
    this.open = false;
  }


}
