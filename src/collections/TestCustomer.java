package collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class TestCustomer {

	public static void main(String[] args) {
		ArrayList<Customer> alC=new ArrayList<Customer>();
		alC.add(new Customer("x",Gender.MALE,LocalDate.of(1999,10,9),"x@gmail.com"));
		alC.add(new Customer("y",Gender.FEMALE,LocalDate.of(1998, 12, 4),"y@gmail.com"));
		alC.add(new Customer("z",Gender.MALE,LocalDate.of(2004, 2, 15),"z@gmail.com"));
		alC.add(new Customer("sam",Gender.MALE,LocalDate.of(2006, 4, 25),"sam@gmail.com"));
		alC.add(new Customer("uma",Gender.FEMALE,LocalDate.of(1997, 2, 14),"uma@gmail.com"));
		alC.add(new Customer("rithika",Gender.FEMALE,LocalDate.of(1992, 5, 19),"rithika@gmail.com"));
		alC.add(new Customer("Phani",Gender.MALE,LocalDate.of(1996, 6, 25),"phani@gmail.com"));
		alC.add(new Customer("raj",Gender.MALE,LocalDate.of(1993, 2, 23),"raj@gmail.com"));
		alC.add(new Customer("Hari",Gender.MALE,LocalDate.of(1994, 2, 16),"Hari@gmail.com"));
		alC.add(new Customer("suma",Gender.FEMALE,LocalDate.of(1998, 5, 9),"suma@gmail.com"));
		
		
		Comparator<Customer> comparebybirthday=(o1,o2)-> {if(o1.getBirthday().isAfter(o2.getBirthday())){
			return 1;
			
		}else if(o1.getBirthday().isBefore(o2.getBirthday())){
			return -1;
		}
		return 0;
	};
		Collections.sort(alC,comparebybirthday );	
		for (Customer customer : alC) {
			System.out.println(customer.getName());
		}
		System.out.println("  ");
		ArrayList<Customer> sublist=listByAge(alC,18);
		for (Customer customer : sublist) {
			System.out.println(customer.getName()+":"+customer.getEmail());
			
		}
		
		System.out.println("female greater than age 18");
		System.out.println("");
		ArrayList<Customer> subListByGen=listByGender(alC, 20, Gender.FEMALE);
		for (Customer customer : subListByGen) {
			System.out.println(customer.getName()+":"+customer.getBirthday()+":"+customer.getEmail());
		}

		 
	}

	public static ArrayList<Customer> listByAge(ArrayList<Customer> custList,int age){
		ArrayList<Customer> subList=new ArrayList<Customer>();
		LocalDate presentDate=LocalDate.now();
		for (Customer customer : custList) {
			if((presentDate.getYear()-customer.getBirthday().getYear())>age){
				subList.add(customer);
			}
		}
		return subList;
	}
	public static ArrayList<Customer> listByGender(ArrayList<Customer> custList,int age,Gender gender){
		ArrayList<Customer> subListG=listByAge(custList, age);
		ArrayList<Customer> subListGen=new ArrayList<Customer>();
	for (Customer customer : subListG) {
		if(customer.getGender()==gender){
			subListGen.add(customer);
		}
		
	}
		
		return subListGen;

	}
	}



