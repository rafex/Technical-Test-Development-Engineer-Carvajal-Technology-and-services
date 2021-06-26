import {
  HttpClient, HttpHeaders
} from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()

export class TableService {
  public url: string = 'http://localhost:8081/api/factorial/6';

  constructor(private http: HttpClient) { }

  getData() {
    return this.http.get(this.url, {
      headers: new HttpHeaders({'Content-Type': 'application/json'}),
      responseType: 'json'
    });
  }
}
