class A
{
	int x;
	int y;
	String str;
	public A(int x, int y, String str) {
		super();
		this.x = x;
		this.y = y;
		this.str = str;
	}
public	void display(){
	System.out.println(x+" "+y+str);
}
	
}
public class ReferenceStrong {

	public static void main(String[] args) {
		A a= new A(1,2,"lion");
		a.display();
		a=null;//it makes object eligible for garbage collection because reference variable not pointing to any object,the object becomes unreachable
		

	}

}
