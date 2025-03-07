import { Component, EventEmitter, Input, Output } from '@angular/core';
import { SentryData } from '../../models/SentryData';

@Component({
  selector: 'sentry-data',
  standalone: true,
  imports: [],
  templateUrl: './sentry-data.component.html',
  styleUrl: './sentry-data.component.css'
})
export class SentryDataComponent {

  //open : boolean = false;

 // @Output() openEventEmitter = new EventEmitter();


 /* onOpenCloseSentryData() {
    //this.open = !this.open;
    this.openEventEmitter.emit();                                               
  }*/

  @Input() sentry_data! : SentryData;

  @Output() closeSentryDataEventEmitter = new EventEmitter();

  onCloseSentryData() {
    this.closeSentryDataEventEmitter.emit();
  }

}
