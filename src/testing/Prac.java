package testing;

public class Prac {
int id;
String author;
Prac(int id,String author){
	this.id=id;
	this.author=author;
}
public boolean equals(Prac p){
	//Object p=new Prac(13,"teja");
    // String s1=this.author;
    // String s2=p.author;
     int a=this.id;
     int b=p.id;
     if(a==b){
    	 return true;
     }
     return false;
}
	public static void main(String[] args) {
		Prac p1=new Prac(13,"ravi"); 
        Prac p2=new Prac(13,"ri");
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        p1.equals(p2);
	}

}
