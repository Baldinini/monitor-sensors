import { Component, OnInit } from '@angular/core';
import { SensorResponseDto } from '../model/sensor-response-dto';
import { SensorService } from '../service/sensor.service';

@Component({
  selector: 'app-sensors-list',
  templateUrl: './sensors-list.component.html',
  styleUrls: ['./sensors-list.component.css']
})

export class SensorsListComponent implements OnInit {
  sensors: SensorResponseDto[] = [];
  displayedColumns: string[] = ['name', 'model', 'typeName', 'unitName', 'range', 'location', 'buttons'];

  filter = {
    keyword: ''
  };
  constructor(private sensorService: SensorService) { }

  ngOnInit(): void {
    this.sensorService.getAllSensors().subscribe(sensors => this.sensors = sensors);
  }
  getAllSensors(): void {
    this.sensorService.getAllSensors().subscribe(sensors => this.sensors = this.filterSensor(sensors));
  }
  delete(id: number): void {
    this.sensorService.deleteSensor(id).subscribe(() => {
      this.ngOnInit();
    });
  }
  filterSensor(sensors: SensorResponseDto[]): SensorResponseDto[] {
    return sensors.filter((e) => {
      return e.name.toLowerCase().includes(this.filter.keyword.toLowerCase())
        || e.model.toLowerCase().includes(this.filter.keyword.toLowerCase())
        || e.typeName.toLowerCase().includes(this.filter.keyword.toLowerCase())
        || e.unitName.toLowerCase().includes(this.filter.keyword.toLowerCase());
    });
  }
}
