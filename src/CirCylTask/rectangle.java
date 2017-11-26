package CirCylTask;

public abstract class rectangle extends Hubby {
	
	public rectangle(int radius, double height) {
		super(radius, height);
		// TODO Auto-generated constructor stub
	}

	public void rectangleArea(){
		
	double ci=	circumference(radius);
		double RectangleArea= ci * height ;
		System.out.println("Rectangle area"+ RectangleArea);
	}
	

}
