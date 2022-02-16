import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
        
        ArrayList<ContactDetails> contact = new ArrayList<ContactDetails>();
        
        Console con = System.console();

        System.out.println("Enter the FName and Lname");
        String fName = con.readLine();
        String lName = con.readLine();

        System.out.println("Enter the address");
        String address = con.readLine();
        
        System.out.println("Enter the city");
        String city = con.readLine();
        
        System.out.println("Enter the state");
        String state = con.readLine();
        
        System.out.println("Enter the zip code");
        String zip = con.readLine();
        
        System.out.println("Enter the PhoneNumber");
        String phoneNumber = con.readLine();
        
        System.out.println("Enter the Email");
        String eMail = con.readLine();
        
        ContactDetails details = new ContactDetails(fName,lName,address,city,state,zip,phoneNumber,eMail);
        	contact.add(details);
        	
        for (ContactDetails i : contact) {
        	System.out.println("FName: "+ i.getFName()+ "\nLname: "+ i.getLName()+ "\nAddress: "+ i.getAddress()+
        			"\nCity: "+i.getCity()+"\nState: "+i.getState()+"\nZip Code: "+ i.getZip()+"\nPhone Number: "+ i.getPhoneNumber()+ "\nEmail: "+i.getEMail());
        	}
        }
	}
