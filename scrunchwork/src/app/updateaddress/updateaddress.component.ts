import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employeedata } from '../employeedata';

@Component({
  selector: 'app-updateaddress',
  templateUrl: './updateaddress.component.html',
  styleUrls: ['./updateaddress.component.css']
})
export class UpdateaddressComponent implements OnInit {

  employeedata:Employeedata =new Employeedata();
  empdataId!:Number;

  constructor(private empservice:EmployeeService,
    private router:Router,
    private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.employeedata = new Employeedata();
    this.empdataId= this.route.snapshot.params['empdataId'];

    this.empservice.getEmployeedataById(this.empdataId).subscribe(data =>{
      console.log(data);
      this.employeedata=data;
    },
    error =>console.log(error));
    }

    gotoemplist(){
      this.router.navigate(['/employee']);
    }

    OnSubmit(){
      this.empservice.updateEmployeedata(this.empdataId,this.employeedata).subscribe(data =>{
    this.gotoemplist();
    },error =>console.log(error));
    }

}
