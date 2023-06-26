import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClgdetailsComponent } from './clgdetails/clgdetails.component';
import { CreateemployeeComponent } from './employees/createemployee/createemployee.component';
import { EmployeelistComponent } from './employees/employeelist/employeelist.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SignupComponent } from './signup/signup.component';
import { UserlistComponent } from './userlist/userlist.component';

const routes: Routes = [
  { path:'home', component: HomeComponent },
  { path:'login', component: LoginComponent },
  { path:'signup', component: SignupComponent },
  { path:'navbar', component: NavbarComponent },
  {path:'clgdetails',component:ClgdetailsComponent},
  {path:'userlist',component:UserlistComponent},
  {path:'employee',component:EmployeelistComponent},
  {path:'create',component:CreateemployeeComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
