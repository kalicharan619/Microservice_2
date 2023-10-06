package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class PersonConfig {
	
	@Bean
	public RestTemplate createRestObject()
	{
		return new RestTemplate(); 
		
	}
	
	@Bean
	public ObjectMapper createObjectMapper() {
		
	   return new ObjectMapper();
	}
	
	
	
	
	
	

}
