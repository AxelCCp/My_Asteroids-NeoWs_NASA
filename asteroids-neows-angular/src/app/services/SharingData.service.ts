import { EventEmitter, Injectable } from "@angular/core";
import { AsteroidDto } from "../models/AsteroidDto";

@Injectable({
    providedIn: 'root'
  })
export class SharingDataService {

    private _newUserEventEmitter : EventEmitter<AsteroidDto> = new EventEmitter();

    private _selectAsteroidEventEmitter = new EventEmitter();

    private _findAsteroidByIdEventEmitter = new EventEmitter();

    constructor() { }

    get selectAsteroidEventEmitter() {
        return this._selectAsteroidEventEmitter
    }

    get findAsteroidByIdEventEmitter() {
        return this._findAsteroidByIdEventEmitter;
    } 
}