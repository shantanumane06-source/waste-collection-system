package com.example.demo.entity;

import java.beans.JavaBean;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CollectorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String mobile;
	private String vehicleNumber;
	
	private Boolean available=true;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private UserEntity user;
	
	@OneToMany(mappedBy = "collector")
	private List<Booking> bookings;
	
}
