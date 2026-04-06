package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CollectorEntity;

public interface CollectorRepo extends JpaRepository<CollectorEntity, Long>{

}
