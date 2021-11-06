package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.Contact;

@Service
public class AddressBookService implements IAddressBookService {
	private List<Contact> contactList = new ArrayList<>();

	@Override
	public List<Contact> getContact() {
		return contactList;
	}

	@Override
	public Contact getContactById(String id) {
		return contactList.stream().filter(c -> c.getId().equals(id)).findFirst().orElseThrow(() -> new AddressBookException("Contact not found"));
	}

	@Override
	public Contact createContact(AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  new Contact("1", addressBookDTO);
		contactList.add(contact);
		return contact;
	}

	@Override
	public Contact updateContact(String id, AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  getContactById(id);
		int index = contactList.indexOf(contact);
		contact.setName(addressBookDTO.getName());
		contactList.set(index, contact);
		return contact;
	}

	@Override
	public void deleteContact(String id) {
		Contact contact = getContactById(id);
		int index = contactList.indexOf(contact);
		contactList.remove(index);
		return;
	}
	
}
