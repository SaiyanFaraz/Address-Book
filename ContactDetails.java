
public class ContactDetails {
	private String fName;
	private String lName;
	private String address; 
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;
	
	public String getFirstName() {
		return fName;
	}
	public String setFirstName(String firstName){
        this.fName = firstName;
        return firstName;
    }
    public String setLastName(String lastName){
        this.lName = lastName;
        return lastName;
    }
    public long setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
    public String setEmail(String eMail){
        this.eMail = eMail;
        return eMail;
    }
    public String setAddress(String address){
        this.address = address;
        return address;
    }
    public String setCity(String city){
        this.city = city;
        return city;
    }
    public String setState(String state){
        this.state = state;
        return state;
    }
    public int setZipCode(int zipCode) {
        this.zip = zipCode;
        return zipCode;
    }
    @Override
    public String toString() {
        return "\nPerson Info [first Name = " + fName + ", last Name = " + lName + ", Email id = " + eMail +
                ", address = " + address + "," + " city = " + city + ", state = " + state + ", zipcode = " + zip + ", " +
                "phoneNumber = " + phoneNumber + "]\n";
        }
}
