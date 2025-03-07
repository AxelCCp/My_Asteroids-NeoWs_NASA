import { Component, Input } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AsteroidDto } from '../../models/AsteroidDto';
import { Apod } from '../../models/Apod';

@Component({
  selector: 'navbar',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {

  @Input() asteroidDtoList : AsteroidDto[] = [];

  @Input() apod! : Apod;

}
