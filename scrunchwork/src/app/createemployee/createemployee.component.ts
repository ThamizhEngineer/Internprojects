import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-createemployee',
  templateUrl: './createemployee.component.html',
  styleUrls: ['./createemployee.component.css']
})
export class CreateemployeeComponent implements OnInit {

  employee =new Employee();

  constructor(private empservice:EmployeeService,private router:Router) { }

  ngOnInit(): void {
  }

  saveemployee(){
    this.empservice.createemployee(this.employee).subscribe(data =>{
      console.log(data);

    },
    error=>console.log(error));

  }

  gotoemplist(){
    this.router.navigate(['/createemp']);
  }

  OnSubmit(){
    console.log(this.employee);
    this.saveemployee();
    this.router.navigate(['/createemp']);
  }
}
