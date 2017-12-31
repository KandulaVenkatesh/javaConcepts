package collections;
import java.util.ArrayList;

@FunctionalInterface
interface ListGen<T> {
	    Customer compareGenericMethod(Customer a,Object obj);//only one abstract method
	//functional interface can contain any number of static and default methods:
	    public static ArrayList<Customer> compareGenericMethod1(ArrayList<Customer> a, char c) {
			ArrayList<Customer> alc=new ArrayList<Customer>();
			for (Customer customer : a) {
				if(customer.getName().charAt(0)==c){
					alc.add(customer);
				}
				
			}
			return alc;
		}}