package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

public @Data class Contact {
	private String id;
	private String name;
	
	public Contact() {}
	
	public Contact(String id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.name = addressBookDTO.getName();
	}
}
