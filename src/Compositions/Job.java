package Compositions;

public class Job {
	private String role;
	private int id;
	private float salary;
	private String company;
	public Job(){
		
	}
	public Job(String role,int id,float salary,String company){
		setRole(role);
		setId(id);
		setSalary(salary);
		setCompany(company);
		
		
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
