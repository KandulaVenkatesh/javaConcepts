package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Customer {

	
	private	String name;
	private	Gender gender;
	private	LocalDate birthday;
	private	String Email;
	
	
	public Customer(String name,Gender gender, LocalDate birthday, String email) {
		setName(name);
		setGender(gender);
		setBirthday(birthday);
		setEmail(email);
	}
	
	@Override
	public boolean equals(Object obj) {

		Customer customer2=(Customer)obj;
		if(customer2 != null){
		if(this.name==customer2.name && this.gender.equals(customer2.gender)&& this.birthday.equals(customer2.birthday)&&this.Email==customer2.Email){
			return true;
		}
		}
		// TODO Auto-generated method stub
		return false;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
		
	}
		
		

	



