import { Component, OnInit } from '@angular/core';
import { AsteroidDto } from '../../models/AsteroidDto';
import { ActivatedRoute } from '@angular/router';
import { SharingDataService } from '../../services/SharingData.service';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-load-asteroid',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './load-asteroid.component.html',
  styleUrl: './load-asteroid.component.css'
})
export class LoadAsteroidComponent implements OnInit {


  asteroidDto! : AsteroidDto;

  constructor(  private route : ActivatedRoute, private sharingData : SharingDataService,) {

    this.asteroidDto = new AsteroidDto();
  }


  ngOnInit(): void {

    this.sharingData.selectAsteroidEventEmitter.subscribe(asteroidDto => this.asteroidDto = asteroidDto); 

    this.route.paramMap.subscribe(param => {
      const idAsteroid : number = +(param.get('id') || '0');
      if(idAsteroid > 0) {
        this.sharingData.findAsteroidByIdEventEmitter.emit(idAsteroid);
      }
    })
   
  }
  

}
