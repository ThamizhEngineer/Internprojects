/* eslint-disable eol-last */
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthConstants } from 'auth-constants';
import { Login } from 'src/app/models/login.models';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  lgdata = new Login();
  invalidLogin =false;

  constructor(private lgservice: LoginService,
    private router: Router) { }

  ngOnInit() {
    localStorage.setItem('isLoginsuccess','0');
  }

  loginAction(){
    (this.lgservice.getlogindata(this.lgdata).subscribe(
      (res) => {

        localStorage.setItem('isLoginsuccess','1');
        this.invalidLogin = false;

        const logindata=res;
        if(logindata!==null){
          this.router.navigateByUrl('/products');

        }else{
          this.router.navigateByUrl('/login');
          alert('incorrect credentials');
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
  signup(){
    this.router.navigateByUrl('/signup');
  }
}
