package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Person;
import com.example.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/data/person")
	public ResponseEntity<Person> personRecord(int personId)
	{
		Person personData= personService.personData(personId);
		return new ResponseEntity<>(personData, HttpStatus.OK);
		
	}

}
