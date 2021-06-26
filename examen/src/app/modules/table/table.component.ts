import {
  Component, Input
} from '@angular/core';

@Component({
  selector: 'boot-table',
  styleUrls: ['./table.component.scss'],
  templateUrl: './table.component.html'
})

export class TableComponent {
  @Input() rows: any;

  objectKeys = Object.keys;

  constructor() {}
}
