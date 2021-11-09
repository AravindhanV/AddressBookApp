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
	private String id;
	private String name;
	
	public Contact() {}
	
	public Contact(AddressBookDTO addressBookDTO) {
		this.updateAddressBook(addressBookDTO);
	}
	
	public void updateAddressBook(AddressBookDTO addressBookDTO) {
		this.name = addressBookDTO.getName();
	}
}
