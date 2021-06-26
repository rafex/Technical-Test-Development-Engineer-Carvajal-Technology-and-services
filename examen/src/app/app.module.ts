import { AppComponent } from './app.component';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { TableComponent } from '@modules/table/table.component';
import { TableService } from '@services/table.service';

@NgModule({
  bootstrap: [AppComponent],
  declarations: [
    AppComponent,
    TableComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [TableService]
})

export class AppModule { }
