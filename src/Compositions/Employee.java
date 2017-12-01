package Compositions;
//Employee is a container
//employee cannot exist without a job
public class Employee {
	//Same employee can have many jobs
	public Job job;
	
	public Employee(Job job) {
		
		this.job = job;
	}
	

	
}
