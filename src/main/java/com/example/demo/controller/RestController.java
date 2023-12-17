package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.MessagemEmail;
import com.example.demo.repository.MessagemEmailRepository;
import com.example.demo.service.messagemEmailService;
import com.example.demo.util.EmailContact;

@org.springframework.web.bind.annotation.RestController()
@RequestMapping("/api")
public class RestController {

	@Autowired
	messagemEmailService  messagemEmailService;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@PostMapping("/email")
	public void email(@RequestBody EmailContact emailContact) {

		messagemEmailService.saveEmail(emailContact);
		
	}
	
}
