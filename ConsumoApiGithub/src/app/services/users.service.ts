import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { GithubSearchResponse } from '../models/github-search-response';
@Injectable({
  providedIn: 'root',
})
export class UsersService {
  private readonly apiUrl = 'https://api.github.com/search/users';

  constructor(private http: HttpClient) {}

  searchUsers(query: string): Observable<GithubSearchResponse> {
    const url = `${this.apiUrl}?q=${encodeURIComponent(query)}`;
    return this.http
      .get<GithubSearchResponse>(url)
      .pipe(catchError(this.handleError));
  }

  private handleError(error: HttpErrorResponse) {
    let errorMessage = 'An error occurred';
    if (error.error instanceof ErrorEvent) {
      // Client-side error
      errorMessage = error.error.message;
    } else {
      // Server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    return throwError(() => error);
  }
}
