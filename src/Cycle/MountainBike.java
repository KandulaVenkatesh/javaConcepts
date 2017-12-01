package Cycle;

public class MountainBike extends BIcycle{
	int seatHeight;
	
	
	
	public MountainBike(int startCadence, int startSpeed, int startGear, int seatHeight) {
		super(startCadence, startSpeed, startGear);
		this.seatHeight = seatHeight;
	}
	public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
	void Definition(){
		System.out.println("A mountain bike or mountain bicycle is a bicycle designed for off-road cycling");
	}

void Brands(){
	System.out.println("cannodale \nTrek  \nspecialized \fiant \nGT \nKona");
}
}
