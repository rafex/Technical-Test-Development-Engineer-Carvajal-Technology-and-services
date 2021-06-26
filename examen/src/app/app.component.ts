import { Component } from '@angular/core';
import { TableService } from '@services/table.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})

export class AppComponent {
  data: any = {};
  showTable: boolean = false;

  constructor(private tableService: TableService) { }

  getDataTable() {
    this.showTable = true;

    this.tableService.getData()
      .subscribe(result => this.data = result);
  }
}
