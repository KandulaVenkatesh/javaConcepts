package CirCylTask;

public  class circle  extends rectangle {
	double CircleArea;
	




public circle(int radius, double height) {
		super(radius, height);
		// TODO Auto-generated constructor stub
	}

public void circleArea(){
	
	
	
	
	double CircleArea= Math.PI * radius * radius;
	System.out.println("Area of the circle: "+CircleArea);
	
	
}

public double circArea(){
	
	
	
	
	double CircArea= Math.PI * radius * radius;
	return CircArea;
	
}
}
