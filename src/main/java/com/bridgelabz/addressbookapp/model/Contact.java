package com.bridgelabz.addressbookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name = "contact")
public @Data class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	private int id;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	
	public Contact() {
		
	}
	public Contact(AddressBookDTO addressBookDTO) {
		this.updateAddressBookData(addressBookDTO);
	}
	public void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.name = addressBookDTO.name;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zip = addressBookDTO.zip;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
