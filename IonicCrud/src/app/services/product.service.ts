/* eslint-disable @typescript-eslint/type-annotation-spacing */
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Cart } from '../models/cart.models';
import { Products } from '../models/products.models';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  cartItems:Cart[]=[];
  url = 'http://192.168.1.13:8087/api/main/value/products';
  nameurl = 'http://192.168.1.13:8087/api/main/value/products/name';

  serviceApiUrl: string = environment.producturl;
  constructor(private http:HttpClient) { }
  getproducts():Observable<Products[]>{
    return this.http.get<Products[]>(this.url);
  }
  getproductbyid():Observable<HttpResponse<Products[]>>{
    return this.http.get<Products[]>(this.url,{observe:'response'});
  }
  insertproducts(prod:Products):Observable<HttpResponse<Products[]>>{
    return this.http.post<Products[]>(this.url,prod ,{observe:'response'});
  }
  getnameproducts():Observable<any>{
    return this.http.get<any>(this.nameurl);
  }

  productsdata():Observable<Products[]>{
    return this.http.get<Products[]>(environment.producturl );
  }

}
// getEmployee():Observable<Employee[]>{
//   return this.http.get<Employee[]>(`${this.baseurl}`);
// }
// getEmployeeById(emp_ID:Number):Observable<Employee>{
//   return this.http.get<Employee>(`${this.baseurl}/${emp_ID}`);
// }

// createemployee(employee:Employee):Observable<any>{
//   return this.http.post(`${this.baseurl}`,employee);
// }

// updateEmployee(emp_ID:Number,employee:Employee):Observable<Employee[]>{
//   return this.http.put<Employee[]>(`${this.baseurl}/${emp_ID}`,employee);
// }

// deleteEmployee(emp_ID:Number):Observable<Object>{
//   return this.http.delete(`${this.baseurl}/${emp_ID}`,{responseType:'text'});
// }
