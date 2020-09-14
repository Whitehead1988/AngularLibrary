import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListBooksComponent } from './list-books/list-books.component';

const routes: Routes = [
    {
        path: '',
        component: ListBooksComponent,
        data: {
            title: 'ListBooksComponent'
        }
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
