package com.bridgelabz.addressbookapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	@RequestMapping(value= {"","/"})
	public String welcomeUser() {
		return "Welcome to address book home";
	}
}
