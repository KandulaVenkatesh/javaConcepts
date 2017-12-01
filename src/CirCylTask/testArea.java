package CirCylTask;

import java.util.Scanner;

public class testArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of a cylinder");
		int rad=sc.nextInt();
		System.out.println("Enter Height of a cylinder");
		double heigh=sc.nextDouble();
		System.out.println("radius :"+ rad +"\nheight"+ heigh);
		sc.close();
		
	
	circle c1=new circle(rad,heigh);
c1.circleArea();
	c1.rectangleArea();
	double a= c1.circArea();
	rectangle r1= new rectangle(rad,heigh);
	
	
	double areaOfCylinder= 2 * a + r1.rectArea()  ;
	System.out.println("AOC: "+areaOfCylinder);
	
	
		// TODO Auto-generated method stub	
	
	}

}
