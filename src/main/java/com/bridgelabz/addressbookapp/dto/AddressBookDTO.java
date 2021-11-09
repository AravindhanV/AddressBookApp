package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import lombok.ToString;

public @ToString class AddressBookDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Contact name Invalid")
	public String name;
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
}
