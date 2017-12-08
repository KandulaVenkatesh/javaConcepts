import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

class D
{
	int x;
	int y;
	String str;
	public D(int x, int y, String str) {
		super();
		this.x = x;
		this.y = y;
		this.str = str;
	}
public	void display(){
	System.out.println(x+" "+y+str);
}
}
public class ReferencePhantom {

	public static void main(String[] args) {
	D d=new D(1,7,"Phantom");
	ReferenceQueue<D> q=new ReferenceQueue<D>();
	PhantomReference<D> phantomD=new PhantomReference<D>(d, q);
	d=null;
	System.out.println(d);
	d=phantomD.get();
	System.out.println(d);
	

	}

}
