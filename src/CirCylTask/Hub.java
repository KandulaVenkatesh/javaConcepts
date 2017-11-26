package CirCylTask;

public abstract class Hub implements taskInterface {

	 int radius;
	double height;
	
	
	
	public Hub(int radius, double height) {
		
		this.radius = radius;
		this.height = height;
		
	}

	void display(){
		System.out.println("radius: "+ radius+"\nheight: "+ height );
	}

	double circumference(int radius){
	double Circumference;
	return Circumference= 2 * Math.PI * radius ;
	

	}
	
	
	

}
 
 