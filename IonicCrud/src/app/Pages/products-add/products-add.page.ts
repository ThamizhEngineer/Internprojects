/* eslint-disable quote-props */
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, FormGroupDirective, NgForm, Validators } from '@angular/forms';
import { ErrorStateMatcher } from '@angular/material/core';
import { Router } from '@angular/router';
import { Products } from 'src/app/models/products.models';
import { ProductService } from 'src/app/services/product.service';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';
export class MyErrorStateMatcher implements ErrorStateMatcher {
  isErrorState(control: FormControl | null, form: FormGroupDirective | NgForm | null): boolean {
    const isSubmitted = form && form.submitted;
    return !!(control && control.invalid && (control.dirty || control.touched || isSubmitted));
  }
}
@Component({
  selector: 'app-products-add',
  templateUrl: './products-add.page.html',
  styleUrls: ['./products-add.page.scss'],
})
export class ProductsAddPage implements OnInit {
  prods = new Products();
  productForm: FormGroup;


  isLoadingResults = false;
  matcher = new MyErrorStateMatcher();

   constructor(
     private router: Router,
     private service: ProductService,
     private formBuilder: FormBuilder) { }

   ngOnInit() {
     this.productForm = this.formBuilder.group({
       'productid' : [null, Validators.required],
       'productname' : [null, Validators.required],
       'productprice' : [null, Validators.required],
       'quantity':[null,Validators.required]
     });
   }

   saveproducts() {
      this.isLoadingResults = true;
      this.service.insertproducts(this.productForm.value)
        .subscribe((res: any) => {
         this.prods=res;
         console.log(this.prods);
            this.isLoadingResults = false;
           this.router.navigateByUrl('/products');
         }, (err: any) => {
           console.log(err);
          this.isLoadingResults = false;
         });
    }
   goproducts(){
    this.router.navigate(['/products']);
   }
    onFormSubmit(){
      console.log(this.productForm.value);
      this.saveproducts();
      this.router.navigate(['/products']);
    }
 }
