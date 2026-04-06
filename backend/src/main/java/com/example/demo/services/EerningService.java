package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EarningEntity;
import com.example.demo.repository.EarningRepo;

@Service
public class EerningService {

	@Autowired
	private EarningRepo earningRepo;
	
	public EarningEntity addEarning(EarningEntity earning) {
		return earningRepo.save(earning);
	}
	public List<EarningEntity>getAllEarning(){
		return earningRepo.findAll();
	}
}
