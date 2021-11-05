package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.Contact;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<Contact> getContact() {
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("1",new AddressBookDTO("Alice")));
		return contacts;
	}

	@Override
	public Contact getContactById() {
		Contact contact = null;
		contact = new Contact("1",new AddressBookDTO("Bob"));
		return contact;
	}

	@Override
	public Contact createContact(AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  new Contact("1", addressBookDTO);
		return contact;
	}

	@Override
	public Contact updateContact(AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  new Contact("1", addressBookDTO);
		return contact;
	}

	@Override
	public void deleteContact(String id) {
		// TODO Auto-generated method stub
		return;
	}
	
}
