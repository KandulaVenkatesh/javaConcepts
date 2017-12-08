package CirCylTask;

public class Cylinder {
	Circle circle;
	Rectangle rectangle;
	
	

public Cylinder(Circle circle, Rectangle rectangle) {
		super();
		this.circle = circle;
		this.rectangle = rectangle;
	}
public double cylinderArea(){

double area=2*circle.circArea()+rectangle.rectArea();
return area;
}

}
