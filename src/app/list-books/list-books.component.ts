import { Component, OnInit } from '@angular/core';
import { NgAlertService, MessageType } from '@theo4u/ng-alert';
import { RestService } from '../rest.service';
import { ActivatedRoute, Router } from '@angular/router';
import { IBook } from '../interfaces/ibook';

@Component({
  selector: 'app-list-books',
  templateUrl: './list-books.component.html',
  styles: []
})
export class ListBooksComponent implements OnInit {

  books: IBook[] = [];

  constructor(public rest:RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.getBooks();
  }

  getBooks() {
    this.rest.getBooks().subscribe(books => {
      console.log(books);
      this.books = books._embedded.bookList;
      console.log(books._embedded.bookList)
    });
  }

  deleteBook(id) {
      this.rest.deleteBook(id)
        .subscribe(res => {
          console.log(res);
            this.getBooks();
          }, (err) => {
            console.log(err);
          }
        );
    }

}
