/* eslint-disable @typescript-eslint/ban-types */
/* eslint-disable @typescript-eslint/type-annotation-spacing */
/* eslint-disable @typescript-eslint/naming-convention */
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from '../models/login.models';

@Injectable({
  providedIn: 'root'
})
export class LoginService {


  Baseurl = 'http://192.168.1.11:8087/api/main/value/login';

  constructor(private http: HttpClient) { }
  getlogindata(lgdata:Login):Observable<Object>{
    return this.http.post(this.Baseurl,lgdata);
  }
}

