package com.example.server.service;


import com.example.server.model.Type;

import java.util.Optional;

public interface TypeService {
    Optional<Type> getById(Long id);
}
