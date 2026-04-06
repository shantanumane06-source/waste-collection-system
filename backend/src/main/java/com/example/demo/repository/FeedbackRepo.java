package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FeedBackEntity;

public interface FeedbackRepo extends JpaRepository<FeedBackEntity, Long>{

}
