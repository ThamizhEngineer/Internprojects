import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [

  {
    path: '',
    redirectTo: 'products',
    pathMatch: 'full'
  },
  {
    path: 'home',
    loadChildren: () => import('./Pages/home/home.module').then( m => m.HomePageModule)
  },
  {
    path: 'login',
    loadChildren: () => import('./Pages/login/login.module').then( m => m.LoginPageModule)
  },
  {
    path: 'signup',
    loadChildren: () => import('./Pages/signup/signup.module').then( m => m.SignupPageModule)
  },
  {
    path: 'product-description',
    loadChildren: () => import('./Pages/product-description/product-description.module').then( m => m.ProductDescriptionPageModule)
  },
  {
    path: 'product-edit',
    loadChildren: () => import('./Pages/product-edit/product-edit.module').then( m => m.ProductEditPageModule)
  },
  {
    path: 'tabs',
    loadChildren: () => import('./Pages/tabs/tabs.module').then( m => m.TabsPageModule)
  },
  {
    path: 'products',
    loadChildren: () => import('./Pages/products/products.module').then( m => m.ProductsPageModule)
  },
  {
    path: 'products-add',
    loadChildren: () => import('./Pages/products-add/products-add.module').then( m => m.ProductsAddPageModule)
  },
  {
    path: 'searchbox',
    loadChildren: () => import('./Pages/searchbox/searchbox.module').then( m => m.SearchboxPageModule)
  },
  {
    path: 'list',
    loadChildren: () => import('./Pages/list/list.module').then( m => m.ListPageModule)
  },
  {
    path: 'place',
    loadChildren: () => import('./Pages/place/place.module').then( m => m.PlacePageModule)
  },
  {
    path: 'cart',
    loadChildren: () => import('./Pages/cart/cart.module').then( m => m.CartPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
