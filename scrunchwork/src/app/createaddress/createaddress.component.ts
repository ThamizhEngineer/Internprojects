import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employeedata } from '../employeedata';

@Component({
  selector: 'app-createaddress',
  templateUrl: './createaddress.component.html',
  styleUrls: ['./createaddress.component.css']
})
export class CreateaddressComponent implements OnInit {

  employeedata =new Employeedata();

  constructor(private empservice:EmployeeService,private router:Router) { }

  ngOnInit(): void {
  }

  saveemployeeaddress(){
    this.empservice.createemployeedata(this.employeedata).subscribe(data =>{
      console.log(data);

    },
    error=>console.log(error));

  }

  gotoemplist(){
    this.router.navigate(['/createempaddress']);
  }

  OnSubmit(){
    console.log(this.employeedata);
    this.saveemployeeaddress();
    this.router.navigate(['/createempaddress']);
  }
}
