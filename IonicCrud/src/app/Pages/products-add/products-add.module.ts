import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { ProductsAddPageRoutingModule } from './products-add-routing.module';
import { ProductsAddPage } from './products-add.page';
import {MatButtonModule}from '@angular/material/button';
import {MatIconModule}from '@angular/material/icon';
import {MatFormFieldModule}from '@angular/material/form-field';
import {MatInputModule}from '@angular/material/input';
//import {MatSpinner} from'@angular/material/progress-spinner';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    IonicModule,
    MatIconModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    ProductsAddPageRoutingModule,
  ],
  declarations: [ProductsAddPage],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
})
export class ProductsAddPageModule {}
