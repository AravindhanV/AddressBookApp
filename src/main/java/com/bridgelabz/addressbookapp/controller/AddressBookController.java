package com.bridgelabz.addressbookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.bridgelabz.addressbookapp.services.IAddressBookService;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value= {"","/"})
	public ResponseEntity<ResponseDTO> welcomeUser() {
		List<Contact> contactList = addressBookService.getContact();
		ResponseDTO resDTO = new ResponseDTO("GET call successful",contactList);
		return new ResponseEntity<ResponseDTO>(resDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> welcomeSpecificUser(@PathVariable("id") String id) {
		Contact contact = null;
		contact = addressBookService.getContactById();
		ResponseDTO respDTO = new ResponseDTO("GET by id successful",contact);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> createContact(@RequestBody AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  addressBookService.createContact(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("POST successful",contact);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateContact(@RequestBody AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  addressBookService.updateContact(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("PUT successful",contact);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteContact(@PathVariable("id") String id) {
		addressBookService.deleteContact(id);
		ResponseDTO respDTO = new ResponseDTO("DELETE Successful","Deleted id: "+id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
