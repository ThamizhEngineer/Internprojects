import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeComponent } from './employee/employee.component';
import { LayoutComponent } from './layout/layout.component';
import { LoginComponent } from './login/login.component';
import { SubjectComponent } from './subject/subject.component';

const routes: Routes = [
  {path:'login',component:LoginComponent},
   {path:'employee',component:EmployeeComponent},
   {path:'layout',component:LayoutComponent},
   {path:'subject',component:SubjectComponent},
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
