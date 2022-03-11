package com.bl.model;
public class ContactDetails {
	private String fName;
	private String lName;
	private String address; 
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;
		
    public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
    public String toString() {
        return "\nPerson Info [first Name = " + fName + ", last Name = " + lName + ", Email id = " + eMail +
                ", address = " + address + "," + " city = " + city + ", state = " + state + ", zipcode = " + zip + ", " +
                "phoneNumber = " + phoneNumber + "]\n";
        }
}
