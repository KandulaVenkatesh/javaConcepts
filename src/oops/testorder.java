package oops;


import java.io.*;
import java.text.StringCharacterIterator;
import java.util.Scanner;
public class testorder {
	
	

	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
	
		
		
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
		System.out.println("Enter sel: quantity: and paid amountpaid: ");
		int sel=sc.nextInt();
		int quan=sc.nextInt();
		int amounpaid=sc.nextInt();
		
		values1.orderConfirmation(sel,quan,amounpaid);
		
		values1.printdetails();
		System.out.println("Enter city");
		String cit=sc.next();
		System.out.println("Enter State");
		String stat=sc.next();
		System.out.println("Enter Country");
		String contry=sc.next();
		shipping address=new shipping(cit,stat,contry);
		values1.shippingAddress(address);
		
		
		
		
		
	
		
	//values1.detailsEnter(shipping address);
		
		
		//accessing static variable.For Accessing static method we don't need to create any reference variable
		
		

	}

}
