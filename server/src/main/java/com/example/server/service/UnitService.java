package com.example.server.service;


import com.example.server.model.Unit;

import java.util.Optional;

public interface UnitService {
    Optional<Unit> getById(Long id);
}
