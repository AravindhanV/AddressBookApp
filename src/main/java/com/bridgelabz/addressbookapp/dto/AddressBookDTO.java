package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
	public String name;
	
	public AddressBookDTO(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public String toString() {
		return "{name:"+name+"}";
	}
}
