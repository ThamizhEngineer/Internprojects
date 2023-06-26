import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Employeedata } from '../employeedata';
import { Pipe, PipeTransform } from '@angular/core';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees!:Employee[];
  employeedata!:Employeedata[];
  emp_ID!:Number;

  SearchTerm!:String;
  constructor(private EmpService:EmployeeService,private router:Router) { }

  ngOnInit(): void {

    this.getEmployee();
    this.Employeedata();
  }

  private getEmployee(){
    this.EmpService.getEmployee().subscribe  (data=>{
    this.employees=data;
    console.log(data);
  });
}
public Employeedata(){
  this.EmpService.getEmployeedata().subscribe(data=>{
  this.employeedata=data;
  console.log(data);
});
}
  AddRow(){
    this.router.navigate(['/createemp']);

  }
  employeedetails(emp_ID:Number){
    this.router.navigate(['/view',emp_ID]);
  }

  deleteemployee(emp_ID:Number){
    this.EmpService.deleteEmployee(emp_ID).subscribe(data =>{
      console.log(data);
        this.getEmployee();
})
}

  updateemployee(emp_ID:Number){
    this.router.navigate(['/updateemp',emp_ID]);
  }

  //function for child tables
  AddRowadd(){
    this.router.navigate(['/createaddress']);

  }
  deleteemployeeadd(empdataId:Number){
    this.EmpService.deleteEmployeedata(empdataId).subscribe(data =>{
      console.log(data);
        this.Employeedata();
  })
  }


  updateemployeeadd(empdataId:Number){
    this.router.navigate(['/updateempaddress',empdataId]);
  }

  }
