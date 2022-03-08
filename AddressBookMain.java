import java.io.Console;
import java.util.ArrayList;

public class AddressBookMain {
	
	public static void main(String[] args) {
        
        ArrayList<ContactDetails> contact = new ArrayList<ContactDetails>();
        
        Console con = System.console();

     // Checking If there is no console available, then exit.
        if(con == null) 
        {
            System.out.print("No console available");
            return;
        }
        
        String fName = con.readLine("Enter the FName");
        String lName = con.readLine("Enter the LName");

        String address = con.readLine("Enter the address");
        
        String city = con.readLine("Enter the city");
        
        String state = con.readLine("Enter the state");
        
        String zip = con.readLine("Enter the zip code");
        
        String phoneNumber = con.readLine("Enter the PhoneNumber");
        
        String eMail = con.readLine("Enter the Email");
        
        ContactDetails details = new ContactDetails(fName,lName,address,city,state,zip,phoneNumber,eMail);
        	contact.add(details);
        	
        for (ContactDetails i : contact) {
        	System.out.println("FName: "+ i.getFName()+ "\nLname: "+ i.getLName()+ "\nAddress: "+ i.getAddress()+
        			"\nCity: "+i.getCity()+"\nState: "+i.getState()+"\nZip Code: "+ i.getZip()+"\nPhone Number: "+ i.getPhoneNumber()+ "\nEmail: "+i.getEMail());
        	}
        }
	}
