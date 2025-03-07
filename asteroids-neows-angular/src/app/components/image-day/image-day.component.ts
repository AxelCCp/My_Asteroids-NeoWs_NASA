import { Component, OnInit } from '@angular/core';
import { Apod } from '../../models/Apod';
import { ApodService } from '../../services/Apod.service';
import { Router } from '@angular/router';

@Component({
  selector: 'image-day',
  standalone: true,
  imports: [],
  templateUrl: './image-day.component.html',
  styleUrl: './image-day.component.css'
})
export class ImageDayComponent implements OnInit {

  apod! : Apod;

  constructor(private router : Router, private apodService : ApodService) {
    if(this.router.getCurrentNavigation()?.extras.state) {
      this.apod = this.router.getCurrentNavigation()?.extras.state!['apod'];
    }
  }

  ngOnInit(): void {
    if(this.apod == undefined || this.apod == null) {
      this.apodService.getApod().subscribe(apod => this.apod = apod);
    }
  }

}
