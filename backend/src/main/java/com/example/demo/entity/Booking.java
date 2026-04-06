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
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime dateTime;
	
	@Enumerated(EnumType.STRING)
	private PaymentMode payment;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToOne
	private UserEntity user;
	
	@ManyToOne
	private CollectorEntity collector;
	
	public enum WasteType{
		DRY, WET,PLASTIC,E_WASTE
	}
	
	public enum PaymentMode{
		ONLINE, CASH
	}
	
	public enum Status{
		PENDING, COMPLETED
	}
	
	
}
