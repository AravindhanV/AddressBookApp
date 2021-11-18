package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import lombok.ToString;

public @ToString class AddressBookDTO {
	@Pattern(regexp = "^[A-Z|a-z]{2,}$",message ="Name Invalid")
	public String name;
	public String address;
	public String city;
	public String state;
	@Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$",message ="Zip invalid")
	public String zip;
	@Pattern(regexp = "^[0-9]{2,3}\\s[0-9]{10}$",message ="Phone number invalid")
	public String phoneNumber;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
