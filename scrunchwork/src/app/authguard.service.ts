import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthguardService {

check(uname: string, pwd : string)
{
if(uname == "admin" && pwd =="admin@123"){
localStorage.setItem('username',"admin");
return true;
}
else{
  return false;
}
  }

}
