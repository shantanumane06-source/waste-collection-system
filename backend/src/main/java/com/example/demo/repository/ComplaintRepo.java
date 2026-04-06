package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ComplaintEntity;

public interface ComplaintRepo extends JpaRepository<ComplaintEntity, Long>{

}
