package com.example.server.repository;

import com.example.server.model.Unit;
import com.example.server.model.UnitName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnitRepository extends JpaRepository<Unit, Long> {
    Optional<Unit> findByUnitName(UnitName name);
}
