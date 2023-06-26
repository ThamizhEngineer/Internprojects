import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { LogoutComponent } from './logout/logout.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { UserService } from './user.service';
import { UserComponent } from './user/user.component';
import { LoginguardGuard } from './loginguard.guard';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeedataComponent } from './employeedata/employeedata.component';
import { CreateemployeeComponent } from './createemployee/createemployee.component';
import { UpdateemployeeComponent } from './updateemployee/updateemployee.component';
import { Employeefilter } from './employee-filter.pipe';


@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    LoginComponent,
    HomeComponent,
    AboutComponent,
    LogoutComponent,
    UserComponent,
    EmployeeComponent,
    EmployeedataComponent,
    CreateemployeeComponent,
    UpdateemployeeComponent,
    Employeefilter

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    ],
  providers: [UserService,LoginguardGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
