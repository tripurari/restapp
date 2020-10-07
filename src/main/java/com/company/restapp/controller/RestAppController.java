package com.company.restapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.company.restapp.dto.ResponseOutput;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/")
@Slf4j
@RequiredArgsConstructor
public class RestAppController {

	private final RestTemplate restTemplate;
	@Value("${operations.restURL}")
	String serviceURL;
	@GetMapping(value="language/{lang}")
	ResponseEntity<ResponseOutput> getAvailableOperation(@PathVariable("lang") String language) {
		log.info("Service Started");
		String url=serviceURL+":"+language;
		ResponseOutput response = restTemplate.getForObject(url, ResponseOutput.class);
		return ResponseEntity.ok(response);
	
	}
	
}
