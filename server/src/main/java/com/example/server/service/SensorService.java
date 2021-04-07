package com.example.server.service;


import com.example.server.model.Sensor;

import java.util.List;

public interface SensorService {
    void save(Sensor sensor);

    void delete(Long id);

    String getDescription(Long id);

    List<Sensor> getAll();

    Sensor getById(Long id);
}
