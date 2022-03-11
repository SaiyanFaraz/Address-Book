package com.bl.dao;

import java.util.ArrayList;

import com.bl.model.ContactDetails;

public class AddressBookDAO {
//	persistant logic
	
	private ArrayList<ContactDetails> personList = new ArrayList<>();
	
	public ArrayList<ContactDetails> getAllPerson() {
		return personList;
	}
	
	public void addContact(ContactDetails contactDetails) {
		personList.add(contactDetails);
		System.out.println(personList.size());
	}
	
	public Boolean isUserExistByName(String name) {
		for (int i = 0; i < personList.size(); i++) {
			if(personList.get(i).getfName().equals(name)) {
				return true;
			}
		}	
		return false;
	}
	public void updateContactDetails(ContactDetails remainingContactDetail) {
		for (ContactDetails contactDetails : personList) {
			if(contactDetails.getfName().equals(remainingContactDetail.getfName())) {
				contactDetails.setlName(remainingContactDetail.getlName());
				contactDetails.setAddress(remainingContactDetail.getAddress());
				contactDetails.setCity(remainingContactDetail.getCity());
				contactDetails.setState(remainingContactDetail.getState());
				contactDetails.setZip(remainingContactDetail.getZip());
				contactDetails.setPhoneNumber(remainingContactDetail.getPhoneNumber());
				contactDetails.seteMail(remainingContactDetail.geteMail());
			}
		}
	}
	public void deleteContactDetails(String deleteName) {
		for (int i = 0; i < personList.size(); i++) {
			if(personList.get(i).getfName().equals(deleteName)) {
				personList.remove(i);
			}
			
		}		
	}	
}
