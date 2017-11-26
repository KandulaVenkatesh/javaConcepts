package cyli;



public abstract class centered1  {

	 int radius;
	double height;
	
	
	
	public centered1(int radius, double height) {
		
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
 
 