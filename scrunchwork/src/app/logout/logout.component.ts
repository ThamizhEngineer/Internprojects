import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { Logindata } from '../logindata';
import { UserService } from '../user.service';



@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

   lg = new Logindata();
  userName!: String;
  passWord!: String;

  constructor( private authenticationService: AuthService,private router:Router) { }

  ngOnInit(): void {

  }

  logout() {
    this.authenticationService.logout();
    this.router.navigate(['']);
  }


}
