package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EarningEntity;

public interface EarningRepo extends JpaRepository<EarningEntity, Long>{

}
