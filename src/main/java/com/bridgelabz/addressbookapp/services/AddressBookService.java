package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.Contact;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {
	@Autowired
	private AddressBookRepository addressRepository;
	private List<Contact> contactList = new ArrayList<>();

	@Override
	public List<Contact> getContact() {
		return addressRepository.findAll();
	}

	@Override
	public Contact getContactById(String id) {
		return contactList.stream().filter(c -> c.getId().equals(id)).findFirst().orElseThrow(() -> new AddressBookException("Contact not found"));
	}

	@Override
	public Contact createContact(AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  new Contact(addressBookDTO);
		contactList.add(contact);
		return addressRepository.save(contact);
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
		Contact addrBookData = this.getContactById(id);
		addressRepository.delete(addrBookData);
	}
	
}
