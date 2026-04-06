package com.example.demo.entity;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String message;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	private LocalDateTime createdAt;
	
	@ManyToOne
	private UserEntity user;
	
	public enum Status{
		OPEN,RESOLVED
	}
}
