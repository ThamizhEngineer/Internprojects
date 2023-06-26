import { Pipe, PipeTransform } from "@angular/core";
import { Employee } from "./employee";


@Pipe({
   name:'employeeFilter'
})
export class Employeefilter implements PipeTransform{
  transform(employees:Employee[] ,SearchTerm:String):Employee[] {
    if(!employees || !SearchTerm){
      return employees;
    }else{
      return employees.filter(employee =>(employee.first_Name.toLowerCase().indexOf(SearchTerm.toLowerCase())) !== -1)
    }
  }
}
