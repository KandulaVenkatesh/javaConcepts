package Compositions;

public class TestComposition {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Job[] jobArray=new Job[2];
		jobArray[0]=new Job("parttime instructor",2,30000,"x");
		jobArray[1]=new Job("TeamLead",1234,80000,"y");
		employee.setJob(jobArray);
		System.out.println("jobs doing by employee \n");
		for(Job job : jobArray){
			System.out.println("Role : "+job.getRole()+"\nID : "+job.getId()+"\nsalary : "+job.getSalary()+"\nCompany : "+job.getCompany());
		
			System.out.println("\n");
		}
		
	}

}
