package Cycle;

public class TandemBike extends BIcycle {
	int noOfSeats;
	
	public TandemBike(int startCadence, int startSpeed, int startGear, int noOfSeats) {
		super(startCadence, startSpeed, startGear);
		this.noOfSeats = noOfSeats;
	}

	void definition(){
		System.out.println("The tandem bicycle or twin is a form of bicycle (occasionally a tricycle) designed to be ridden by more than one person");
	}

	void Brands(){
		System.out.println("Kinethic \nDuratec \n \nHokitika \nPaketa \nSalsa");
	}

	
	
}
