package CirCylTask;

public abstract class Hubby  {

	 int radius;
	double height;
	
	
	
	public Hubby(int radius, double height) {
		
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
 
 