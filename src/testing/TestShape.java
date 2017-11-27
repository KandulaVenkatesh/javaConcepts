package testing;

public class TestShape extends Shape {
public void rectangle(){
	System.out.println("Rectangle in child class");
}
	public static void main(String[] args) {
		Shape s=new TestShape();
         s.rectangle();
	}

}
