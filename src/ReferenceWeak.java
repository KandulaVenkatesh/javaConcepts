import java.lang.ref.WeakReference;

class C
{
	int x;
	int y;
	String str;
	public C(int x, int y, String str) {
		super();
		this.x = x;
		this.y = y;
		this.str = str;
	}
public	void display(){
	System.out.println(x+" "+y+str);
}
}
public class ReferenceWeak {

	public static void main(String[] args) {
		C c=new C(3,6,"Weak");
		WeakReference<C> weakC=new WeakReference<C>(c);
		c=null;//object(3,6,") available for garbage collection
		System.out.println(c);
		c=weakC.get();//generally jvm ignores weak references
		// they are eligible for garbage collection
		/*if the object not yet removed from the jvm it is easy to recover
		 * using weak referenced object
		 * 
		 */
		
		System.out.println(c);
		
		

	}

}
