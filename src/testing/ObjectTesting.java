package testing;

public class ObjectTesting {
      int rollNo;
      int classNo;
      String stuName;
      public ObjectTesting(int rollNo,int classNo,String stuName){
    	  this.rollNo=rollNo;
    	  this.classNo=classNo;
    	  this.stuName=stuName;
      }
      
      public boolean equals(ObjectTesting obj){
//    	 String a=this.stuName;
//    	  String b=obj.stuName;
    	  if(this.rollNo==obj.rollNo&&this.stuName.equals(obj.stuName)){
    		  return true;
    	  }
    	  return false;
      }
      public static void main(String[] args){
    	  ObjectTesting obj1=new ObjectTesting(12, 414, "venkatesh");
    	  ObjectTesting obj2=new ObjectTesting(12,414 , "venkatesh");
    	  System.out.println(obj1.equals(obj2));
    	  
      }

}
