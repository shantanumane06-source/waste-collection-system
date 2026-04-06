package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ComplaintEntity;
import com.example.demo.repository.ComplaintRepo;

@Service
public class ComplaintService {

	@Autowired
	private ComplaintRepo complaintRepo;
	
	public ComplaintEntity addComplaint(ComplaintEntity complaintEntity) {
		complaintEntity.setStatus(ComplaintEntity.Status.OPEN);
		return complaintRepo.save(complaintEntity);
	}
	public List<ComplaintEntity>getAllComplaints(){
		return complaintRepo.findAll();
	}
	
}
