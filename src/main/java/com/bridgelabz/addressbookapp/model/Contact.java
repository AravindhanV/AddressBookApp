package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class Contact {
	private String id;
	private String name;
	
	public Contact() {}
	
	public Contact(String id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.name = addressBookDTO.getName();
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name  = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
