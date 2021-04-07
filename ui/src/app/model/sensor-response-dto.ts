export class SensorResponseDto {
  id: number;
  name: string;
  model: string;
  typeName: string;
  unitName: string;
  location: string;
  description: string;
  rangeFrom: number;
  rangeTo: number;

  constructor(id: number, name: string, model: string, typeName: string, unitName: string, location: string, description: string,
              rangeFrom: number, rangeTo: number) {
    this.id = id;
    this.name = name;
    this.model = model;
    this.typeName = typeName;
    this.unitName = unitName;
    this.location = location;
    this.description = description;
    this.rangeFrom = rangeFrom;
    this.rangeTo = rangeTo;
  }
}
