package com.example.server.controllers;

import com.example.server.dto.request.SensorRequestDto;
import com.example.server.dto.response.SensorResponseDto;
import com.example.server.mapper.SensorMapper;
import com.example.server.model.Sensor;
import com.example.server.service.SensorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@Log4j2
@RequestMapping("/sensors")
public class SensorController {

    private final SensorService sensorService;
    private final SensorMapper mapper;

    @Autowired
    public SensorController(SensorService sensorService, SensorMapper mapper) {

        this.sensorService = sensorService;
        this.mapper = mapper;
    }

    @PostMapping
    public void create(@RequestBody SensorRequestDto sensorDto) {

        log.warn("method: create");
        sensorService.save(mapper.toEntity(sensorDto));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody SensorRequestDto sensorDto) {

        log.warn("method: update");
        Sensor sensor = mapper.toEntity(sensorDto);
        sensor.setId(id);
        sensorService.save(sensor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        log.warn("method: delete");
        sensorService.delete(id);
    }

    @GetMapping
    public List<SensorResponseDto> getAll(/*@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "2") Integer size*/) {

        log.warn("method: getAll");
        /*Pageable pageable = PageRequest.of(page, size);*/
        return sensorService.getAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}/description")
    public String getDescription(@PathVariable Long id) {

        log.warn("method: getDescription");
        return sensorService.getDescription(id);
    }

    @GetMapping("/{id}")
    public SensorResponseDto getById(@PathVariable Long id) {

        log.warn("method: getSensorById");
        return mapper.toDto(sensorService.getById(id));
    }
}
