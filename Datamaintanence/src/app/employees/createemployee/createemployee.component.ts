import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employee } from 'src/app/model/employee';


@Component({
  selector: 'app-createemployee',
  templateUrl: './createemployee.component.html',
  styleUrls: ['./createemployee.component.css']
})
export class CreateemployeeComponent implements OnInit {

  employees!: Employee;


  id!:number;
  name:String="";
  gender:String="";
  email?:String="";
  phonenumber?:number;
  contactpreferences:String="";
  dateofbirth!:Date;
  department:String="";
  isActive:boolean=true;
  photopath?:String="";


  constructor() { }

  ngOnInit(): void {
  }


  save(employeeForm:NgForm){
    console.log(employeeForm.value);
  }

}
