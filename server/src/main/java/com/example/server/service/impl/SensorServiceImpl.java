package com.example.server.service.impl;

import com.example.server.model.Sensor;
import com.example.server.repository.SensorRepository;
import com.example.server.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorServiceImpl implements SensorService {
    private final SensorRepository sensorRepository;

    @Autowired
    public SensorServiceImpl(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @Override
    public void save(Sensor sensor) {
        sensorRepository.save(sensor);
    }

    @Override
    public void delete(Long id) {
        sensorRepository.deleteById(id);
    }

    @Override
    public String getDescription(Long id) {
        return sensorRepository.getDescription(id);
    }

    @Override
    public List<Sensor> getAll(/*Pageable pageable*/) {
        return sensorRepository.findAll();
    }

    @Override
    public Sensor getById(Long id) {

        return sensorRepository.findById(id).get();
    }
}
