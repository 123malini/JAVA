import { Component, Input, Output, EventEmitter} from '@angular/core';
// import { EventEmitter } from 'events';

@Component({
  selector: 'app-childcomponent',
  templateUrl: './childcomponent.component.html',
  styleUrls: ['./childcomponent.component.css']
})
export class ChildcomponentComponent {

  msg: string;
  @Input()
  val: string;

  @Output()
  value11Change = new EventEmitter();

  enteredValue(){
    this.value11Change.emit(this.msg);
    console.log("CHILD MSG:" +this.msg);
  }
}
