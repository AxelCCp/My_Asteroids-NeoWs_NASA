import { Injectable } from '@angular/core';
import { Apod } from '../models/Apod';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';

@Injectable({
    providedIn: 'root'
  })
export class ApodService {

    constructor(private http : HttpClient) {}   

    apod! : Apod;

    private url : string = 'https://api.nasa.gov/planetary/apod?api_key=YKd2TyxHrZbamKVPNkcaU099dj79gGQXHwuHS3A3'

    getApod() : Observable<Apod> {
        return this.http.get(this.url).pipe( 
            map((data : any) => {
                console.log('data: ', data);
                return data as Apod;
                }   
            )   
        );
    } 
    

}