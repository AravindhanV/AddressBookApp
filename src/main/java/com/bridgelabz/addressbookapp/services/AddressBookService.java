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

	@Override
	public List<Contact> getContact() {
		return addressRepository.findAll();
	}

	@Override
	public Contact getContactById(int id) {
		return addressRepository.findById(id).orElseThrow(() -> new AddressBookException("Contact not found"));
	}

	@Override
	public Contact createContact(AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  new Contact(addressBookDTO);
		return addressRepository.save(contact);
	}

	@Override
	public Contact updateContact(int id, AddressBookDTO addressBookDTO) {
		Contact contact = null;
		contact =  getContactById(id);
		contact.setName(addressBookDTO.getName());
		contact.setAddress(addressBookDTO.getAddress());
		contact.setCity(addressBookDTO.getCity());
		contact.setState(addressBookDTO.getState());
		contact.setZip(addressBookDTO.getZip());
		contact.setPhoneNumber(addressBookDTO.getPhoneNumber());
		return addressRepository.save(contact);
	}

	@Override
	public void deleteContact(int id) {
		Contact addrBookData = this.getContactById(id);
		addressRepository.delete(addrBookData);
	}
	
}
