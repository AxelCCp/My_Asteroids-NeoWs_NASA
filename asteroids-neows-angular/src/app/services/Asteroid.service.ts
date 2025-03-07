import { Injectable } from '@angular/core';
import { AsteroidDto } from '../models/AsteroidDto';
import { HttpClient } from '@angular/common/http';
import { Observable, map, of } from 'rxjs';
import { Test } from '../models/Test';
import { SentryData } from '../models/SentryData';


@Injectable({
    providedIn: 'root'
  })
export class AsteroidService {

    constructor(private http : HttpClient) {}   

    asteroidDtoList : AsteroidDto[] = [];

    private url : string = 'http://localhost:8080/AsteroidResult/list';

    findAll() : Observable<AsteroidDto[]> {
        //return this.http.get<AsteroidDto[]>(this.url);  
        return this.http.get(this.url).pipe( 
            map((data : any) => {
                console.log('data: ', data);
                return data as AsteroidDto[];
                }   
            )   
        );
    } 


    getSentryData( sentry_data_url : string) :  Observable<SentryData>{

        return this.http.get(sentry_data_url).pipe( 
            map((data : any) => {
                console.log('data-sentry-data: ', data);
                return data as SentryData;
                }   
            )   
        );
    }



    tests : Test[] = [];

    findAll2() : Observable<Test[]> {

        console.log('AsteroidService - findAll 2');

        return this.http.get('http://localhost:8080/AsteroidResult/test').pipe(
            map((data : any) => {

                console.log('data: ', data)

                return data as Test[];
            }),
        );

    } 

}