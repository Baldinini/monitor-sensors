import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateSensorComponent } from './create-sensor/create-sensor.component';
import { SensorsListComponent } from './sensors-list/sensors-list.component';

const routes: Routes = [
  { path: '', redirectTo: 'sensors', pathMatch: 'full'},
  { path: 'sensors', component: SensorsListComponent },
  { path: 'sensors/create', component: CreateSensorComponent },
  { path: 'sensors/edit/:id', component: CreateSensorComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
  ],
  exports: [
    RouterModule,
  ]
})

export class AppRoutingModule {

}
