package com.example.server.service.impl;

import com.example.server.model.Unit;
import com.example.server.repository.UnitRepository;
import com.example.server.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService {

    private final UnitRepository unitRepository;

    @Autowired
    public UnitServiceImpl(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    @Override
    public Optional<Unit> getById(Long id) {
        return unitRepository.findById(id);
    }
}
