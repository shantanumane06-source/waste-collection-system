package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CollectorEntity;
import com.example.demo.repository.CollectorRepo;

@Service
public class CollectorService {

	@Autowired 
	private CollectorRepo collectorRepo;
	
	public CollectorEntity register(CollectorEntity collectorEntity) {
		return collectorRepo.save(collectorEntity);
	}
	
	public List<CollectorEntity> getAllCollector(){
		return collectorRepo.findAll();
	}
	public Optional<CollectorEntity>getCollectorByName(String name){
		return collectorRepo.findByName(name);
	}
}
