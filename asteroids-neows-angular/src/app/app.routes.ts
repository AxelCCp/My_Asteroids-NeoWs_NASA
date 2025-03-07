import { Routes } from '@angular/router';
import { HomePageComponent } from './components/home-page/home-page.component';
import { ImageDayComponent } from './components/image-day/image-day.component';
import { AsteroidReportComponent } from './components/asteroid-report/asteroid-report.component';

export const routes: Routes = [


    {
        path : '',
        pathMatch : 'full',
        redirectTo : '/home'
    },
    
    {
        path : 'home',
        component : HomePageComponent
    },

    {
        path : 'day-image',
        component : ImageDayComponent
    },

    {
        path : 'asteroid-report',
        component : AsteroidReportComponent 
    },


];
