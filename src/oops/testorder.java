package oops;


import java.io.*;
import java.text.StringCharacterIterator;
import java.util.Scanner;
public class testorder {
	shipping address;
	

	public static void main(String[] args)throws IOException{
		shipping address;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		//parameterized constructor
		orderobject values1=new orderobject();
		values1.displayitems();
		System.out.println("orderID:");
		values1.orderID=Integer.parseInt(br.readLine());
		System.out.println("orderName: ");
		values1.OrderName=br.readLine();
		System.out.println("noOfItems: ");
		values1.noOfItemsLeft=Integer.parseInt(br.readLine());
		values1.price=100;
		
		values1.orderConfirmation(3,2,1000);
		
		values1.printdetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city");
		
		String city=sc.next();
		System.out.println("Enter State");
		String State=sc.next();
		
	System.out.println(city+"\n"+State);
		
	//values1.detailsEnter(shipping address);
		
		
		//accessing static variable.For Accessing static method we don't need to create any reference variable
		
		

	}

}
