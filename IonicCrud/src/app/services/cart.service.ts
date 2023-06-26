/* eslint-disable @typescript-eslint/type-annotation-spacing */
/* eslint-disable eqeqeq */
/* eslint-disable no-trailing-spaces */
/* eslint-disable prefer-const */
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private cart=[];
  private cartItemcount = new BehaviorSubject(0);
  constructor(private router:Router) { }

  getcart(){
    return this.cart;
  }
  getitemcount(){
    return this.cartItemcount;
  }
  addcart(cart){
    let added =false;
    for(let c of this.cart){
      if(c.productid === cart.productid){
        c.productprice +=1;
        added =true;
        break;
      }
    }
    if(!added){
      cart.amount=1;
      this.cart.push(cart);
    }
    this.cartItemcount.next(this.cartItemcount.value + 1);
  }

  decreasecart(cart){
    for(let [index,c] of this.cart.entries()){
      if(c.productid === cart.productid){
        c.productprice -= 1;
        if(c.productprice == 0){
          this.cart.slice(index,1);

        }
      }
    }
    this.cartItemcount.next(this.cartItemcount.value -1);
  }
  removecart(cart){
    for(let [index,c] of this.cart.entries()){
      if(c.productid === cart.productid){
        this.cartItemcount.next(this.cartItemcount.value - c.productprice);
        this.cart.slice(index,1);

      }
    }
  }
  readcart(cart){
    this.router.navigate(['/cart']);
  }
}
