import java.lang.ref.SoftReference;



	
class B
{
	int x;
	int y;
	String str;
	public B(int x, int y, String str) {
		super();
		this.x = x;
		this.y = y;
		this.str = str;
	}
public	void display(){
	System.out.println(x+" "+y+str);
}
}
public class ReferenceSoft {

	public static void main(String[] args) {
		B b=new B(2,4,"king");//Strong reference
		/*Soft objects will be cleared from memory
		 when jvm runs out of memory only i.e it 
		 will be garbage collected only when jvm 
		 needs memory badly until that they are not available for garbage collection
		 */
		SoftReference<B> softB=new SoftReference<B>(b);
		b=null;
		
		b=softB.get();
		b.display();
		System.out.println(b);
		System.out.println(b.toString());
	
	}


		

	}


