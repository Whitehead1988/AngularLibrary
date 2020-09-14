import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';
import { IBook } from './interfaces/ibook';

const endpoint = 'http://localhost:8080';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) { }

  getBooks(): Observable<any> {
  return this.http.get(endpoint + '/books').pipe(
    map(res => <IBook[]> res));
}

deleteBook(id): Observable<IBook> {
  return this.http.delete(endpoint + "/books/"+id).pipe(
    tap(_ => console.log(`deleted book id=${id}`)),
      catchError(this.handleError<any>('deleteBook'))
    )
}

createBook(book): Observable<IBook> {
  console.log(JSON.stringify(book));
  return this.http.post(endpoint+ "/books", JSON.stringify(book), {headers: {'Content-Type': 'application/json'} }).pipe(
   tap(_ => console.log(`added book id=${book.id}`)),
     catchError(this.handleError<any>('createBook'))
   )
}

private handleError<T> (operation = 'operation', result?: T) {
  return (error: any): Observable<T> => {

    // TODO: send the error to remote logging infrastructure
    console.error(error); // log to console instead

    // TODO: better job of transforming error for user consumption
    console.log(`${operation} failed: ${error.message}`);

    // Let the app keep running by returning an empty result.
    return of(result as T);
  };
}

}
