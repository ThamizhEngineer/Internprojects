import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/model/employee';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {
employees:Employee[]=[
  {
    id:1,
    name:'Nilesh',
    gender:'Male',
    email:'nilesh@gmail.com',
    phonenumber:9787124321,
    contactpreferences:'Email',
    dateofbirth:new Date('08/11/2021'),
    department:'IT',
    isActive:true,
    photopath:'assets/images/employee.png',
  },
  {
    id:2,
    name:'Nilani',
    gender:'Female',
    email:'nilani@gmail.com',
    contactpreferences:'Phone',
    dateofbirth:new Date('09/23/2011'),
    department:'Doctor',
    isActive:true,
    photopath:'assets/images/woman.png',
  },
  {
    id:3,
    name:'Kadhir',
    gender:'Male',
    email:'kdhir@gmail.com',
    contactpreferences:'Email',
    dateofbirth:new Date('05/28/2003'),
    department:'IT',
    isActive:true,
    photopath:'assets/images/employee.png',
  },
];
  constructor() { }

  ngOnInit(): void {
  }

}
