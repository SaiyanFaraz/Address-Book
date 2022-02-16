import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
        
        ArrayList<ContactDetails> contact = new ArrayList<ContactDetails>();
        
        System.out.println("Enter the FName and Lname");
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.next();
        String lName = scanner.next();

        System.out.println("Enter the address");
        String address = scanner.next();
        
        System.out.println("Enter the city");
        String city = scanner.next();
        
        System.out.println("Enter the state");
        String state = scanner.next();
        
        System.out.println("Enter the zip code");
        int zip = scanner.nextInt();
        
        System.out.println("Enter the PhoneNumber");
        long phoneNumber = scanner.nextLong();
        
        System.out.println("Enter the Email");
        String eMail = scanner.next();
        
        ContactDetails details = new ContactDetails(fName,lName,address,city,state,zip,phoneNumber,eMail);
        	contact.add(details);
        	
        for (ContactDetails i : contact) {
        	System.out.println("FName: "+ i.getFName()+ "\nLname: "+ i.getLName()+ "\nAddress: "+ i.getAddress()+
        			"\nCity: "+i.getCity()+"\nState: "+i.getState()+"\nZip Code: "+ i.getZip()+"\nPhone Number: "+ i.getPhoneNumber()+ "\nEmail: "+i.getEMail());
        	}
        }
	}
