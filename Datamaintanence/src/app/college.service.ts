import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { College } from './model/college';
import { Observable } from 'rxjs/internal/Observable';


@Injectable({
  providedIn: 'root'
})
export class CollegeService {

  private baseurl="http://localhost:8093/api/main/base";

  constructor( private http:HttpClient) { }

  getclgdetails():Observable<College[]>{
    return this.http.get<College[]>
  }

}
