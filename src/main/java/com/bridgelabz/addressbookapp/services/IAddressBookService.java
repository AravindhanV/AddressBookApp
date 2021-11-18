package com.bridgelabz.addressbookapp.services;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.Contact;

public interface IAddressBookService {
	List<Contact> getContact();
	Contact getContactById(int id);
	Contact createContact(AddressBookDTO addressBookDTO);
	Contact updateContact(int id, AddressBookDTO addressBookDTO);
	void deleteContact(int id);
}
