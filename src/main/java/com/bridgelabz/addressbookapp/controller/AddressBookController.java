package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.Contact;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	@RequestMapping(value= {"","/"})
	public ResponseEntity<ResponseDTO> welcomeUser() {
		ResponseDTO resDTO = new ResponseDTO("GET call successful","Welcome to address book");
		return new ResponseEntity<ResponseDTO>(resDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> welcomeSpecificUser(@PathVariable("id") String id) {
		Contact contact = null;
		contact = new Contact("1",new AddressBookDTO("Bob"));
		ResponseDTO respDTO = new ResponseDTO("GET by id successful",contact);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> createContact(@RequestBody AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  new Contact("1", addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("POST successful",contact);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateContact(@RequestBody AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  new Contact("1", addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("PUT successful",contact);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteContact(@PathVariable("id") String id) {
		ResponseDTO respDTO = new ResponseDTO("DELETE Successful","Deleted id: "+id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
