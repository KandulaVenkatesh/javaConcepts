package assignment5;

import Aggregation.Address;

public class Owner {
	String firstName;
	String lastName;
	Double ssn;
	String dob="26-10-1993";
	String address;
	public Owner(String firstName, String lastName, Double ssn, String dob, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.dob = dob;
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSsn() {
		return ssn;
	}

	public void setSsn(Double ssn) {
		this.ssn = ssn;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void display(){
		System.out.println(firstName + lastName+ "  ssn :" +ssn+ "date of birth :"+ dob);
		
	}
	

}
