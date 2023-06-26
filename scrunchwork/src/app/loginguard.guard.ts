import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { Logindata } from './logindata';
import { UserService } from './user.service';


@Injectable({
  providedIn: 'root'
})
export class LoginguardGuard implements CanActivate {

  lg!:Logindata;

  constructor(private service: UserService,private router: Router) { }

    canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {


      if(localStorage.getItem('isLoginsuccess')=='1'){

          return true;

      }else{
        this.router.navigate(['/login']);
        return false;
      }
    }
  }
