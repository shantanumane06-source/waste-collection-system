package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CollectorEntity;
import com.example.demo.repository.CollectorRepo;
import com.example.demo.services.CollectorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/collector")
@CrossOrigin
public class CollectorController {

	@Autowired
	private CollectorService collectorService;
	
	@PostMapping
	public CollectorEntity register(@RequestBody CollectorEntity collectorEntity) {
		return collectorService.register(collectorEntity);
	}
	@GetMapping()
	public List<CollectorEntity>getAllCollector(@RequestParam String param) {
		return collectorService.getAllCollector();
	}
	@GetMapping("/{name}")
	public Optional<CollectorEntity> getCollectorByName(@PathVariable String name) {
		return collectorService.getCollectorByName(name);
	}
	
}
