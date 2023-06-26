import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Logindata } from '../logindata';
import { UserService } from '../user.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


    lg = new Logindata();

    invalidLogin = false;


    constructor(private userservice:UserService,private router:Router) { }
  ngOnInit(): void {

    localStorage.setItem('isLoginsuccess','0');
  }



loginuser() {
  (this.userservice.loginvalues(this.lg).subscribe(
    (res) => {

      localStorage.setItem('isLoginsuccess','1');
      this.invalidLogin = false;

      const logindata=res;
      if(logindata!==null){
        this.router.navigateByUrl('/home');

      }else{
        this.router.navigateByUrl('/login');
        alert('incorrect credentials')
      }

      console.log('response');

    },
    (error) => {
      this.invalidLogin = true;
      console.log('Exception');

    }
  )
  );

}


  }














