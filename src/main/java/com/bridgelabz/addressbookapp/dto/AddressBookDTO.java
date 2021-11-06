package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Contact name Invalid")
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
