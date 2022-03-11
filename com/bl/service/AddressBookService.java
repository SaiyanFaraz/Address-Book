package com.bl.service;

import java.util.ArrayList;

import com.bl.dao.AddressBookDAO;
import com.bl.model.ContactDetails;

public class AddressBookService {
//	business logic
	AddressBookDAO addressBookDAO = new AddressBookDAO();
	
	public void addContact(ContactDetails contactDetails) {
		addressBookDAO.addContact(contactDetails);
	}

	public ArrayList<ContactDetails> getAllPersonDetail() {
		ArrayList<ContactDetails> allPerson = addressBookDAO.getAllPerson();
		return allPerson;
	}
	
	public Boolean isUserExistByName(String name) {
		Boolean check = addressBookDAO.isUserExistByName(name);
		return check;
	}

	public void updateContactDetails(ContactDetails remainingContactDetail) {
		addressBookDAO.updateContactDetails(remainingContactDetail);
	}

	public void deleteContactDetails(String deleteName) {
		addressBookDAO.deleteContactDetails(deleteName);
	}


	
}
