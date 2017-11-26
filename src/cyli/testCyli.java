package cyli;

import java.util.Scanner;

public class testCyli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		centered1 c1=new centered1(3,5) {
		}; 
c1.display();
double value1=c1.circumference(3);
System.out.println("circumference: "+ value1);
circ v2=new circ(3,5){
	
};
double v4=v2.circleArea();
System.out.println("Area of the circle: "+ v4);

rect v3=new rect(3,5){
	
};
double v6= v3.rectangleArea();
System.out.println("Rectangle area"+ v6);
double CylinderArea= 2* v4 +v6;
System.out.println("CylinderArea: "+ CylinderArea );
 

	}

}
