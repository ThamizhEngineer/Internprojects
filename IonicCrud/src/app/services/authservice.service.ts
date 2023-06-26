import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpserviceService } from './httpservice.service';
import { StorageserviceService } from './storageservice.service';

@Injectable({
  providedIn: 'root'
})
export class AuthserviceService {
  login: any;

  constructor(private httpservice: HttpserviceService,
    private storageService: StorageserviceService,
    private router: Router) { }


  // login(postData: any): Observable<any> {
  // return this.httpService.post('login', postData);
  // }

  // signup(postData: any): Observable<any> {
  // return this.httpService.post('signup', postData);
  // }

  // logout() {
  // this.storageService.removeStorageItem(AuthConstants.AUTH).then(res => {
  // this.router.navigate(['/login']);
  // });
  // }
}
