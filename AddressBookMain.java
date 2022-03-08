import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookMain {
	static ArrayList<ContactDetails> personList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static int counter;
	static int indexOfPerson = 0;


	public static void addContact() {

		ContactDetails person = new ContactDetails();

		System.out.println("Add person details");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person first name: ");
		person.setFirstName(sc.next());

		System.out.println("Enter person last name: ");
		person.setLastName(sc.next());

		System.out.println("Enter mobile number: ");
		person.setPhoneNumber(sc.nextLong());

		System.out.println("Enter Email id: ");
		person.setEmail(sc.next());

		System.out.println("Enter address : ");
		person.setAddress(sc.next());

		System.out.println("Enter city: ");
		person.setCity(sc.next());

		System.out.println("Enter State : ");
		person.setState(sc.next());

		System.out.println("Enter zipCode : ");
		person.setZipCode(sc.nextInt());

		personList.add(person);
		System.out.println();
		System.out.println("Person added");
		counter++;
	}
	static void editContact() {

		if (counter > 0) {
			System.out.println("Enter Persons FirstName you want to edit: ");
			String searchName = sc.next();

			boolean isFoundPerson = false;

			for (int i = 0; i < personList.size(); i++) {
				if (personList.get(i).getFirstName().equals(searchName)) {
					isFoundPerson = true;
					indexOfPerson = i;
					break;
				}
			}
			if (isFoundPerson) {

				System.out.println("Enter new address: ");
				personList.get(indexOfPerson).setAddress(sc.next());

				System.out.println("Enter new city  ");
				personList.get(indexOfPerson).setCity(sc.next());

				System.out.println("Enter new zip: ");
				personList.get(indexOfPerson).setZipCode(sc.nextInt());

				System.out.println("Enter mobile number: ");
				personList.get(indexOfPerson).setPhoneNumber(Long.parseLong(sc.next()));

				System.out.println("Enter Email id: ");
				personList.get(indexOfPerson).setEmail(sc.next());

				personList.get(indexOfPerson).setFirstName(searchName);

				System.out.println("Enter Last Name: ");
				personList.get(indexOfPerson).setLastName(sc.next());

				System.out.println();
				System.out.println("Edit completed");

			} else
				System.out.println("No person found with this searchName");
		} else
			System.out.println("There is no record to edit");
	}
	static void deleteContact(){
		if (counter > 0) {
			System.out.println("Enter Persons FirstName you want to edit: ");
			String searchName = sc.next();

			for (int i = 0; i < personList.size(); i++) {
				if (personList.get(i).getFirstName().equals(searchName)) {
					personList.remove(i);
					break;
				}
			}
		}
	}
	static void addMultipleContact() {
		System.out.println("Enter the number of persons whose details you want "
				+ "to add to the address book");
		Scanner sc = new Scanner(System.in);
		int noOfPerson = sc.nextInt();
		for (int i=1;i<=noOfPerson;i++) {
			addContact();
		}
	}
	static void choices() {

		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice \n1: Add Contact \n2: Edit Contact \n3: Display Contact Details \n4: Delete Contact \n0: Exit ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addContact();
				break;
			case 2:
				System.out.println("The entered person details is as follows: ");
				editContact();
				break;
			case 3:
				System.out.println(personList.toString());
				break;
			case 4:
				deleteContact();
				break;
			case 5:
				addMultipleContact();
			default:
				System.out.println("Enter number from 1 to 4");
				choice = 5;
			}
		}
		while (choice < 6);
	}

	public static void main(String[] args) {
		choices();
	}
}
