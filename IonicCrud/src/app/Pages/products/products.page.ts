/* eslint-disable @typescript-eslint/type-annotation-spacing */
/* eslint-disable eol-last */
/* eslint-disable no-trailing-spaces */
/* eslint-disable @typescript-eslint/naming-convention */
import { HttpResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AlertController, NavController, ToastController } from '@ionic/angular';
import { BehaviorSubject } from 'rxjs';
import { Products } from 'src/app/models/products.models';
import { CartService } from 'src/app/services/cart.service';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.page.html',
  styleUrls: ['./products.page.scss'],
})
export class ProductsPage implements OnInit {
  products:any;
  productdata: Products[];
  cart = [];
  cartItemcount:BehaviorSubject<number>;
  constructor(private prodservice: ProductService,
    private cartservice:CartService,
    private toastcontroller: ToastController,
    private alertcontroller: AlertController,
    private navcontroller: NavController,
    private router: Router
    ) { }

  ngOnInit() {
    this.prodservice.getproducts().subscribe(data =>{
      this.productdata=data;
      console.log(data);
      this.cart = this.cartservice.getcart();
      this.cartItemcount = this.cartservice.getitemcount();
    });

  }


  getproducts(){
    this.prodservice.getproducts().subscribe( data=>{
      this.productdata = data;
      console.log(this.productdata);

  });
}
  addcategory(){
    this.router.navigateByUrl('/products-add');
  }
  addTocart(products){
    this.cartservice.addcart(products);
  }
  readcart(cart){
    this.cartservice.readcart(cart);
  }
  deleteproduct(products){
    this.cartservice.decreasecart(products);
  }

}
