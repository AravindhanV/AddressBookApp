package com.bridgelabz.addressbookapp.services;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.Contact;

public interface IAddressBookService {
	List<Contact> getContact();
	Contact getContactById();
	Contact createContact(AddressBookDTO addressBookDTO);
	Contact updateContact(AddressBookDTO addressBookDTO);
	void deleteContact(String id);
}
