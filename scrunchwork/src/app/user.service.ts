import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './model/user';
import { Logindata } from './logindata';
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class UserService {


  private baseurl='http://localhost:8086/api/main/value/get-userlist';


  private loginurl='http://localhost:8086/api/main/value/post-login';


  constructor(private http:HttpClient,private router:Router) { }

  getuserdata():Observable<User[]>{
    return this.http.get<User[]>(`${this.baseurl}`);
  }


  loginvalues(lg:Logindata):Observable<Object>{
    return this.http.post(`${this.loginurl}`,lg);

  }


}
