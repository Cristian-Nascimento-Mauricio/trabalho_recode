package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MessagemEmail;
import com.example.demo.repository.MessagemEmailRepository;
import com.example.demo.util.EmailContact;

@Service
public class messagemEmailService {

	private static final int EMAILINVALID = 0;
	private static final int EMAILVALID = 1;
	private static final int MESSAGEMINVALID = 2;

	@Autowired
	private MessagemEmailRepository repository;
	
	
	public int saveEmail(EmailContact emailContact) {
		
		if(emailContact.getEmail().isEmpty()) return EMAILINVALID;
		
		if(emailContact.getMessagem().isEmpty()) return MESSAGEMINVALID; 
		
		repository.save(new MessagemEmail(emailContact.getEmail(), emailContact.getMessagem()));  
		
		return EMAILVALID;
		
	}
	
}
