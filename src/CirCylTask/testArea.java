package CirCylTask;

import java.util.Scanner;

public class TestArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of a cylinder");
		int rad=sc.nextInt();
		System.out.println("Enter Height of a cylinder");
		double heigh=sc.nextDouble();
		System.out.println("radius :"+ rad +"\nheight"+ heigh);
		sc.close();
		
	
	Circle c1=new Circle(rad,heigh);
c1.circleArea();
	
	
	Rectangle r1= new Rectangle(rad,heigh);
	r1.rectangleArea();

	Cylinder cylinder=new Cylinder(c1, r1);
		// TODO Auto-generated method stub	
	cylinder.circle=c1;
	cylinder.rectangle=r1;
	System.out.println("area is : "+cylinder.cylinderArea());
	
	}

}
