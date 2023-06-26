import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { CreateemployeeComponent } from './createemployee/createemployee.component';
import { EmployeeComponent } from './employee/employee.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { LoginguardGuard } from './loginguard.guard';
import { LogoutComponent } from './logout/logout.component';
import { NavigationComponent } from './navigation/navigation.component';
import { UpdateemployeeComponent } from './updateemployee/updateemployee.component';
import { UserService } from './user.service';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  { path:'home', component: HomeComponent ,canActivate: [LoginguardGuard]},
  { path:'login', component: LoginComponent},
  { path:'user', component:UserComponent ,canActivate: [LoginguardGuard]},
  { path:'about', component:AboutComponent ,canActivate: [LoginguardGuard]},
  { path:'register', component: LogoutComponent,canActivate: [LoginguardGuard] },
  {path:'employee',component:EmployeeComponent,canActivate: [LoginguardGuard] },
  {path:'createemp',component:CreateemployeeComponent ,canActivate: [LoginguardGuard] },
  {path:'updateemp/:emp_ID',component:UpdateemployeeComponent ,canActivate: [LoginguardGuard] },
  { path:'navbar', component: NavigationComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
