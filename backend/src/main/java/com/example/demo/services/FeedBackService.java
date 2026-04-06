package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FeedBackEntity;
import com.example.demo.repository.FeedbackRepo;

@Service
public class FeedBackService {

	@Autowired
	private FeedbackRepo feedbackRepo;
	
	public FeedBackEntity saveFeedbacks(FeedBackEntity feedBack) {
		return feedbackRepo.save(feedBack);
	}
}
