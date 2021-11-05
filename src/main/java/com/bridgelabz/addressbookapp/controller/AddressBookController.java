package com.bridgelabz.addressbookapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/get/{id}")
	public String welcomeSpecificUser(@PathVariable String id) {
		return "Welcome, User "+id;
	}
	
	@PostMapping("/post")
	public String createContact(@RequestBody Contact contact) {
		return "Added "+contact.getName()+" to list";
	}
	
	@PutMapping("/update")
	public String updateContact(@RequestBody Contact contact) {
		return "Updated "+contact.getName()+" in list";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteContact(@PathVariable String id) {
		return "Deleted contact "+id;
	}
}
