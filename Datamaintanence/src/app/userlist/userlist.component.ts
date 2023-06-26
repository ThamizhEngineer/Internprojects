import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

  name = 'Dynamic Add Fields';
  values = [];
  constructor() { }

  ngOnInit(): void {

  }
  clickme(username:string) {
    console.log('it does nothing',username);
  }
  removevalue(i) {
    this.values.splice(i, 1);
 }

 addvalue() {
    this.values.push({ value: ""});
 }
}
