
public class ContactDetails {
	private String fName;
	private String lName;
	private String address; 
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;
	
	public ContactDetails(String fName, String lName, String address, 
			String city, String state, int zip, long phoneNumber, String eMail) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		
		
	}
	
	public String getFName() {
		return this.fName;
	}
	
	public String getLName() {
		return this.lName;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public int getZip() {
		return this.zip;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEMail() {
		return this.eMail;
	}
}