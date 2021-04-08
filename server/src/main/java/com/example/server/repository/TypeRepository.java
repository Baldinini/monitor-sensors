package com.example.server.repository;

import com.example.server.model.Type;
import com.example.server.model.TypeName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type, Long> {
    Optional<Type> findByTypeName(TypeName name);
}
