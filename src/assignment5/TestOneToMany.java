package assignment5;

import Aggregation.Address;
import Aggregation.Employee;

public class TestOneToMany {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("venkatesh","kandula","6034179365");
		Employee employee2=new Employee("Amaresh","Kandula","8686848439");
		
		
		Address[] AddressArray=new Address[3];
		AddressArray[0]=new Address("kansas","missouri","UnitedStates");
		AddressArray[1]=new Address("hyderabad","Andhra","India");
		AddressArray[2]=new Address("denver","colorado","UnitedStates");
		employee1.setAddress(AddressArray);
		
		//employee1 has many addresses
		for (Address address : AddressArray) {
		
			
			System.out.println(employee1.getFirstName()+"\n"+employee1.getLastName()+"\n"+employee1.getMobileNo());
			System.out.println("city: "+ address.getCity()+"\nstate: "+ address.getState()+"\ncountry: "+address.getCountry());
			System.out.println("\n");
			
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
