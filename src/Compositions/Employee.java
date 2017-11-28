package Compositions;
//Employee is a container
//employee cannot exist without a job
public class Employee {
	//Same employee can have many jobs
	private Job[] job;
	public Job[] getJob(){
		return job;
	}
	public void setJob(Job[] job){
		this.job=job;
	}
	

	
}
