import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Empdata } from '../empdata';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-viewemployee',
  templateUrl: './viewemployee.component.html',
  styleUrls: ['./viewemployee.component.css']
})
export class ViewemployeeComponent implements OnInit {
  emp_ID!:Number;
  employee!: Employee;


  constructor(private empservice:EmployeeService,
    private router:Router,
    private route:ActivatedRoute) { }


  ngOnInit(): void {
    this.employee = new Employee();

    this.emp_ID=this.route.snapshot.params['emp_ID'];

    this.empservice.getEmployeeById(this.emp_ID).subscribe(data =>{
      console.log(data);
      this.employee=data;
      let emps= JSON.stringify(this.employee);
      console.log(emps);

    },
    error =>console.log(error));
    }

  }



