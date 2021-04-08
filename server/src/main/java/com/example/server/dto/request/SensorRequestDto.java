package com.example.server.dto.request;

import lombok.Data;

@Data
public class SensorRequestDto {
    private String name;
    private String model;
    private String typeName;
    private String unitName;
    private String location;
    private String description;
    private Integer rangeFrom;
    private Integer rangeTo;
}
