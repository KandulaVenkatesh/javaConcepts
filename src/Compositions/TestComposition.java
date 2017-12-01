package Compositions;

public class TestComposition {

	public static void main(String[] args) {
		Job j=new Job("parttime instructor",2,30000,"x");
		Employee employee=new Employee(j);
		employee.job=j;
		System.out.println(employee.job.getRole());
		
		
	}

}
