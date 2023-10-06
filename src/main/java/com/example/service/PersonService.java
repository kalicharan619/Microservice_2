package com.example.service;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PersonService {
	
	@Value("${api.personById}")
	String personUrlById;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ObjectMapper objectMapper;
	
	public Person personData(int personId)
	{
		//step to make communicate
		
		//1 set UriVariables
		HashMap<String, Integer> uriVariable= new HashMap<String , Integer>();
		uriVariable.put("personId", personId);
		
		// 2. set Headers
		org.springframework.http.HttpHeaders header= new org.springframework.http.HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		//3 set Entity
		
		HttpEntity<String> entity= new HttpEntity<String>(header);
		
		//making call to anothet micro service
		 ResponseEntity<String> exchange=restTemplate.exchange(this.personUrlById, HttpMethod.GET,entity,String.class,uriVariable);
		 String body = exchange.getBody();
		
		 // parsing data from json string
		 Person readvalue=null;
		 
		 try {
			objectMapper.readValue(body, Person.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		 
		 return readvalue;
		} 

		
	}
	


