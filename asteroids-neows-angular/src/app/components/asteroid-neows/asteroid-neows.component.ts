import { Component, OnInit } from '@angular/core';
import { HomePageComponent } from '../home-page/home-page.component';
import { FooterComponent } from '../footer/footer.component';
import { NavbarComponent } from '../navbar/navbar.component';
import { RouterOutlet } from '@angular/router';
import { AsteroidDto } from '../../models/AsteroidDto';
import { AsteroidService } from '../../services/Asteroid.service';
import { Test } from '../../models/Test';

@Component({
  selector: 'asteroid-neows',
  standalone: true,
  imports: [RouterOutlet, NavbarComponent, FooterComponent],
  templateUrl: './asteroid-neows.component.html',
  styleUrl: './asteroid-neows.component.css'
})
export class AsteroidNeowsComponent implements OnInit {

  asteroidDtoList : AsteroidDto[] = [];

  tests : Test[] = [];

  constructor(private asteroidService : AsteroidService) {}
  
  ngOnInit(): void {
    
    this.asteroidService.findAll().subscribe(asteroidDtoList => this.asteroidDtoList = asteroidDtoList);
    
    //this.asteroidService.findAll2().subscribe(tests => this.tests = tests);
    //console.log('tests: ', this.tests);
    
  }

}
