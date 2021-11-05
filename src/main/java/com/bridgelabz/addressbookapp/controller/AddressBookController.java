package com.bridgelabz.addressbookapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.model.Contact;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	@RequestMapping(value= {"","/","/get"})
	public String welcomeUser() {
		return "Welcome to address book home";
	}
	
	@RequestMapping("/get/{id}")
	public String welcomeSpecificUser(@PathVariable String id) {
		return "Welcome, User "+id;
	}
	
	@RequestMapping("/post")
	public String createContact(@RequestBody Contact contact) {
		return "Added "+contact.getName()+" to list";
	}
}
