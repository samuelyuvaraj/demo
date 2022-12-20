package com.example.demo.repo;

import com.example.demo.entity.dataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Datarepo extends JpaRepository<dataEntity, Long> {
}
