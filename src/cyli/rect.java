package cyli;



public abstract class rect extends centered1 {
	double RectangleArea;

	
	public rect(int radius, double height) {
		super(radius, height);
		// TODO Auto-generated constructor stub
	}

	public double rectangleArea(){
		
	double ci=	circumference(radius);
		double RectangleArea= ci * height ;
		return RectangleArea;
	}
	

}
