import { Component } from '@angular/core';
import { AsteroidNeowsComponent } from './components/asteroid-neows/asteroid-neows.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [AsteroidNeowsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Asteroids-NeoWs-NASA';
}
