import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-updateemployee',
  templateUrl: './updateemployee.component.html',
  styleUrls: ['./updateemployee.component.css']
})
export class UpdateemployeeComponent implements OnInit {
  //  employee!: Employee;
  employee:Employee =new Employee();
  emp_ID!:Number;

  constructor(private empservice:EmployeeService,
    private router:Router,
    private route:ActivatedRoute) { }

  ngOnInit(): void {
     this.employee = new Employee();

      this.emp_ID=this.route.snapshot.params['emp_ID'];

      this.empservice.getEmployeeById(this.emp_ID).subscribe(data =>{
        console.log(data);
        this.employee=data;
      },
      error =>console.log(error));
      }

    gotoemplist(){
      this.router.navigate(['/employee']);
    }

  OnSubmit(){
    this.empservice.updateEmployee(this.emp_ID,this.employee).subscribe(data =>{
  this.gotoemplist();
  },error =>console.log(error));
  }

}
