package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.Messaging.SyncScopeHelper;

public class orderobject {
	double orderID;
	String OrderName;
	int noOfItemsLeft;
	double price;
	shipping address;
	final static String wholeSitediscount="30%";
	public orderobject() {
		// TODO Auto-generated constructor stub
	}
	
	public orderobject(double orderID, String OrderName, int noOfItemsLeft, double price){
		super();
		this.orderID = orderID;
		this.OrderName = OrderName;
		this.noOfItemsLeft = noOfItemsLeft;
		this.price = price;
	}
	//static method.We can't access instance variables
	 static String discount(){
		 return wholeSitediscount;
	 }
	 void displayitems(){
		 
		 System.out.println("1.Fairy Lights	\n2.3D printers 3.Powerbanks 4.Drones 5.Fitness Trackers 6.Baby product 7.Auto parts 8.Home decors	" );
		 
	 }
	//second for shipping address
//**void  detailsEnter(shipping address)throws IOException{

	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//System.out.println("Enter the address");
	//address.city=br.readLine();
	//System.out.println("city: "+address.city);
	//address.state=br.readLine();
	//System.out.println("state: "+address.state);
	//address.country=br.readLine();
	//System.out.println("country: "+address.country);


	//   
	
	//better to practice to write as this.variable**
	 //third
	void orderConfirmation(int select,int quantity){
		if(select == orderID){
			System.out.println("order details are :"+OrderName+price);
			if(quantity <= noOfItemsLeft){
				price = quantity * price * 0.7 ;
				System.out.println("you have selected "+quantity+" items ,amount payableis"+price);
					
			}else{
				System.out.println("you have selected invalid quantity");
			}
		}else{System.out.println("order not found");}
	}
	//method overloading to perform similar operations on different sets of data
	//fourth
	void orderConfirmation(int select,int quantity,int amountpaid) throws IOException{
		//calling method
		orderConfirmation(select, quantity);
		
	if(amountpaid >= price){
		if(amountpaid > price){
			
			double remainingbalance = amountpaid - price;
			System.out.println(remainingbalance+"refunded to your account.ready to pack");

		}else{System.out.println("ready to pack");}
		//calling address method
		
		
	}
	
	else{
		System.err.println("Amount not sufficient to purchase an item");
	}
	}
	//we cannot create two methods with same method signature
       //in instance methods we can acceess static variable
	//fifth
	void printdetails(){
	System.out.println("orderID :"+orderID+"\nOrderName :"+OrderName+"\nnoOfItemsLeft :"+noOfItemsLeft+"\nprice"+price+"\nwholeSitediscount :"+wholeSitediscount);
	}
	
	
	

}
