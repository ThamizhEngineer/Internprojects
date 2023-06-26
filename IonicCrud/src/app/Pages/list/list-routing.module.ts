import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchboxPage } from '../searchbox/searchbox.page';

import { ListPage } from './list.page';

const routes: Routes = [
  {
    path: '',
    component: ListPage
  },
  {path:'searchbar',
component:SearchboxPage}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ListPageRoutingModule {}
