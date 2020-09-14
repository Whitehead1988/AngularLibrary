import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, ReactiveFormsModule } from '@angular/forms';
import { RestService } from '../rest.service';
import { IBook } from '../interfaces/ibook';
import { Routes, RouterModule } from '@angular/router';
import { Router } from '@angular/router';


@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styles: []
})
export class AddBookComponent implements OnInit {

  bookForm: FormGroup;
  loader: boolean;

  constructor(private _fb: FormBuilder, public rest:RestService) { }

  ngOnInit() {
    this._createForm();
  }

  private _createForm() {
    this.bookForm = this._fb.group({
      title: ['', Validators.required],
      author: ['', Validators.required],
      genre: ['', Validators.required]
    });
  }

  addBook() {
    const param = this.bookForm.value;
        this.rest.createBook(param)
          .subscribe((book: IBook) => {
             this.bookForm.reset({position: 'Manager'});
             location.reload();
          },
            (error) => {
              console.error(error);
              this.loader = false;
            });
  }

}
