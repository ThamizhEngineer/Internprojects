import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  login(username: string, password: string) {
    if (username == "admin" && password == "admin@123") {
      localStorage.setItem('currentUser', "loggedin");
      return true;
    }else{
      return false;
    }
  }
  logout() {
    localStorage.removeItem('currentUser');
  }
  public get loggedIn(): boolean {
    return (localStorage.getItem('currentUser') !== null);
  }
}
