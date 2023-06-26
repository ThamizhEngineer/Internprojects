import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import { Employeedata } from './employeedata';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {


  private baseurl='http://localhost:8086/api/main/value/employee';

  private childurl='http://localhost:8086/api/main/value/employeechild';


  //private employeedataurl='http://localhost:8086/api/main/value/employee/employeeaddress';

  // private  ="http://localhost:8086/api/main/employeeid/{emp_ID}";

  // private createurl="http://localhost:8086/api/main/emp/employee";

  // private updateurl="http://localhost:8086/api/emp/employee";

  // private deleteurl="http://localhost:8086/api/main/emp";

  //private employeedata="http://localhost:8086/api/main/value/employeeaddress"

  constructor(private http:HttpClient,private router:Router) { }

  getEmployee():Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.baseurl}`);
  }
  getEmployeeById(emp_ID:Number):Observable<Employee>{
    return this.http.get<Employee>(`${this.baseurl}/${emp_ID}`);
  }

  createemployee(employee:Employee):Observable<any>{
    return this.http.post(`${this.baseurl}`,employee);
  }

  updateEmployee(emp_ID:Number,employee:Employee):Observable<Employee[]>{
    return this.http.put<Employee[]>(`${this.baseurl}/${emp_ID}`,employee);
  }

  deleteEmployee(emp_ID:Number):Observable<Object>{
    return this.http.delete(`${this.baseurl}/${emp_ID}`,{responseType:'text'});
  }

//child table api calls
  getEmployeedata():Observable<Employeedata[]>{
    return this.http.get<Employeedata[]>(`${this.childurl}`);
  }
  getEmployeedataById(empaddressId:Number):Observable<Employeedata>{
    return this.http.get<Employeedata>(`${this.childurl}/${empaddressId}`);
  }
  createemployeedata(empaddressId:Number,employeedata:Employeedata):Observable<any>{
    return this.http.post(`${this.childurl}/${empaddressId}`,employeedata);
  }

  updateEmployeedata(empdataId:Number,employeedata:Employeedata):Observable<Employeedata[]>{
    return this.http.put<Employeedata[]>(`${this.childurl}/${empdataId}`,employeedata);
  }

  deleteEmployeedata(empdataId:Number):Observable<Object>{
    return this.http.delete(`${this.childurl}/${empdataId}`,{responseType:'text'});
  }
}
