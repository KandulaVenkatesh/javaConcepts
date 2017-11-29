package assignment5;

public class testOneToOne {
public static void main(String[] args){
	Car c=new Car("Eclipse","2009",48,6);
	Owner o=new Owner("venkatesh","kandula",198433.0,"26/10/1993","kansas");
//	OnetoOne
	c.setOwner(o);
	c.owner=o;
	System.out.println(c.owner.getFirstName()+ c.owner.getLastName());
	
	
}
}
