/* eslint-disable @typescript-eslint/type-annotation-spacing */
import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.page.html',
  styleUrls: ['./product-edit.page.scss'],
})
export class ProductEditPage implements OnInit {

  name:any;
  constructor(private service: ProductService) { }

  ngOnInit() {
    this.service.getnameproducts().subscribe(
     (data)=>{
        this.name =data;
        console.log(this.name);
      }
    );
  }

}
