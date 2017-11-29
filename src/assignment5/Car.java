package assignment5;

public class Car {
	String carName;
	String carModel;
	Owner owner;
	int horsePower;
	int noOfGears;
	public Car(String carName, String carModel, int horsePower, int noOfGears) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		
		this.horsePower = horsePower;
		this.noOfGears = noOfGears;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	

}
