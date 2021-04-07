export class SensorRequestDto {
  id?: number;
  name: string;
  model: string;
  idType: number;
  idUnit: number;
  location?: string;
  description?: string;
  rangeFrom?: number;
  rangeTo?: number;

  constructor(id: number, name: string, model: string, idType: number, idUnit: number, location: string, description: string,
              rangeFrom: number, rangeTo: number) {
    this.id = id;
    this.name = name;
    this.model = model;
    this.idType = idType;
    this.idUnit = idUnit;
    this.location = location;
    this.description = description;
    this.rangeFrom = rangeFrom;
    this.rangeTo = rangeTo;
  }
}
