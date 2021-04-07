package com.example.server.repository;

import com.example.server.model.Sensor;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {

    @Query(value = "SELECT s.description FROM sensors s WHERE s.id = :id")
    String getDescription(Long id);

    @Override
    @EntityGraph(attributePaths = {"type", "unit"})
    List<Sensor> findAll();
}
