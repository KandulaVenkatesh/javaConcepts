package Aggregation;

public class Employee {
private	String firstName;
private	String lastName;
private	String mobileNo;
//employee has a address
private	Address[] address;
public Employee(){
	
}
	public Employee(String firstName, String lastName, String mobileNo) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setMobileNo(mobileNo);
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public Address[] getAddress(){
		return address;
		
	}
	public void setAddress(Address[] address){
		this.address=address;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	

}
