package CirCylTask;

public  class Circle  extends Hub {
	double CircleArea;
	




public Circle(int radius, double height) {
		super(radius, height);
		// TODO Auto-generated constructor stub
	}

public void circleArea(){
	
	
	
	
	double CircleArea= Math.PI * radius * radius;
	System.out.println("Area of the circle : "+CircleArea);
	
	
}

public double circArea(){
	
	
	
	
	double CircArea= Math.PI * radius * radius;
	return CircArea;
	
}
}
