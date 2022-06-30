package com.actuator.metircs.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.actuator.metircs.dto.HealthResponseDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/metrics/food")
public class FoodAppMetrics {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/health")
	public String getHealthDetialsOfFoodApp() throws JsonProcessingException {
		String url = "http://localhost:8082/actuator/health";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(headers);
		Object obj = restTemplate.exchange(url, HttpMethod.GET,entity , Object.class).getBody();
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(obj);
//		HealthResponseDto priceDetails = new HealthResponseDto();
//		return priceDetails;
	}
	
	
	@GetMapping("/info")
	public String getInfoDetialsOfFoodApp() throws JsonProcessingException {
		String url = "http://localhost:8082/actuator/info";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(headers);
		Object obj = restTemplate.exchange(url, HttpMethod.GET,entity , Object.class).getBody();
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(obj);
//		HealthResponseDto priceDetails = new HealthResponseDto();
//		return priceDetails;
	}
	
	@GetMapping("/free-space")
	public String getInformationDetialsOfFoodApp() throws JsonProcessingException {
		String url = "http://localhost:8082/actuator/metrics/disk.free";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(headers);
		Object obj = restTemplate.exchange(url, HttpMethod.GET,entity , Object.class).getBody();
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(obj);
//		HealthResponseDto priceDetails = new HealthResponseDto();
//		return priceDetails;
}
	@GetMapping("/disk.total")
	public String getDiskDetialsOfFoodApp() throws JsonProcessingException {
		String url = "http://localhost:8082/actuator/metrics/executor.active";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(headers);
		Object obj = restTemplate.exchange(url, HttpMethod.GET,entity , Object.class).getBody();
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(obj);
//		HealthResponseDto priceDetails = new HealthResponseDto();
//		return priceDetails;
}
}
