/* eslint-disable @typescript-eslint/type-annotation-spacing */
import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/services/cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.page.html',
  styleUrls: ['./cart.page.scss'],
})
export class CartPage implements OnInit {
cart=[];
  constructor(private cartservice:CartService) { }

  ngOnInit() {
    this.cart= this.cartservice.getcart();
  }
  increasecartitem(product){
    this.cartservice.addcart(product);
  }
  decreasecartitem(product){
    this.cartservice.decreasecart(product);
  }
  removecartitem(product){
    this.cartservice.removecart(product);
  }
  gettotal(){
    return this.cart.reduce((i,j) => i + j.productprice * j.amount,0);
  }
}
