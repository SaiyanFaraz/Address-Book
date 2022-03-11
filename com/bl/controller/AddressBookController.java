package com.bl.controller;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Scanner;

import com.bl.dao.AddressBookDAO;
import com.bl.model.ContactDetails;
import com.bl.service.AddressBookService;

public class AddressBookController {
	
	AddressBookService addressBookService;
	
	public AddressBookController() {
		this.addressBookService = new AddressBookService();
	}
	
	public ContactDetails getPersonContactDetail() {

		ContactDetails person = new ContactDetails();

		System.out.println("Add person details");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person first name: ");
		person.setfName(sc.next());

		System.out.println("Enter person last name: ");
		person.setlName(sc.next());

		System.out.println("Enter mobile number: ");
		person.setPhoneNumber(sc.nextLong());

		System.out.println("Enter Email id: ");
		person.seteMail(sc.next());

		System.out.println("Enter address : ");
		person.setAddress(sc.next());

		System.out.println("Enter city: ");
		person.setCity(sc.next());

		System.out.println("Enter State : ");
		person.setState(sc.next());

		System.out.println("Enter zipCode : ");
		person.setZip(sc.nextInt());
		
		return person;
	}
	
	public ContactDetails getRemainingContactDetail() {

		ContactDetails person = new ContactDetails();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person last name: ");
		person.setlName(sc.next());

		System.out.println("Enter mobile number: ");
		person.setPhoneNumber(sc.nextLong());

		System.out.println("Enter Email id: ");
		person.seteMail(sc.next());

		System.out.println("Enter address : ");
		person.setAddress(sc.next());

		System.out.println("Enter city: ");
		person.setCity(sc.next());

		System.out.println("Enter State : ");
		person.setState(sc.next());

		System.out.println("Enter zipCode : ");
		person.setZip(sc.nextInt());
		
		return person;
	}

	public void choices() {

		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice \n1: Add Contact \n2: Edit Contact \n3: Display Contact Details \n4: Delete Contact \n0: Exit ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				ContactDetails personContactDetail = getPersonContactDetail();
				addressBookService.addContact(personContactDetail);
				break;
			case 2:
				System.out.println("Please enter the name of the contact you want to edit");
				Scanner input = new Scanner(System.in);
				String name = input.next();
				System.out.println("Entered name is: " + name);
				boolean userExistByName = addressBookService.isUserExistByName(name);
				if(userExistByName) {
					ContactDetails remainingContactDetail = getRemainingContactDetail();
					remainingContactDetail.setfName(name);
					addressBookService.updateContactDetails(remainingContactDetail);
				}
				else {
					System.out.println("User not exist by name");
				}
				break;
			case 3:
//				System.out.println(personList.toString());
				System.out.println("The entered person details is as follows: ");
				ArrayList<ContactDetails> allPersonDetail = addressBookService.getAllPersonDetail(); 
				System.out.println(allPersonDetail);
				break;
			case 4:
//				deleteContact();
				System.out.println("Please enter the First name of the contact you want to Delete");
				Scanner input1 = new Scanner(System.in);
				String deleteName = input1.next();
				Boolean userExistByName2 = addressBookService.isUserExistByName(deleteName);
				if(userExistByName2) {
					addressBookService.deleteContactDetails(deleteName);
				}
				break;
			case 5:
//				addMultipleContact();
				System.out.println("Enter the number of contacts you have to add");
				Scanner input3 = new Scanner(System.in);
				int num = input3.nextInt();
				for(int i = 0; i < num; i++) {
					ContactDetails personContactDetail2 = getPersonContactDetail();
					addressBookService.addContact(personContactDetail2);
				}
				
			default:
				System.out.println("Enter number from 1 to 5");
			}
		}
		while (choice < 6);
	}

	public static void main(String[] args) {
		AddressBookController addressBookController = new AddressBookController();
		addressBookController.choices();
	}
}
