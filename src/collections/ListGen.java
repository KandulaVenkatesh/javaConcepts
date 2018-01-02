package collections;

import java.util.ArrayList;

@FunctionalInterface
interface ListGen<T> {

	//abstract method 
	Customer compareGenericMethod(Customer a);//try boolean
 //boolean compareGenericMethod(Customer a);

//	//static method
//	public static ArrayList<Customer> compareGenericMethod1(ArrayList<Customer> a, char c) {
//		ArrayList<Customer> alc=new ArrayList<Customer>();
//		for (Customer customer : a) {
//			if(customer.getName().charAt(0)==c){
//				alc.add(customer);
//			}
//
//		}
//		return alc;
//	}}
}