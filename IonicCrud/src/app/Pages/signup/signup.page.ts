/* eslint-disable @typescript-eslint/no-unused-expressions */
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/app/models/login.models';
import { Products } from 'src/app/models/products.models';
import { Signin } from 'src/app/models/signup';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.page.html',
  styleUrls: ['./signup.page.scss'],
})
export class SignupPage implements OnInit {
  lgdata=new Signin();

  constructor(private lgservice: LoginService,
    private router: Router) { }

  ngOnInit() {

  }
  saveemployee(){
    this.lgservice.getlogindata(this.lgdata).subscribe(data =>{
      console.log(data);

    },
    error=>console.log(error));

  }
  register(){
    this.router.navigate(['/products']);
  }
}

