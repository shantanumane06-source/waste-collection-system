package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CollectorEntity;

public interface CollectorRepo extends JpaRepository<CollectorEntity, Long>{
	Optional<CollectorEntity>findByName(String name);
}
