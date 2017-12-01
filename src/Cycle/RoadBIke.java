package Cycle;

public class RoadBIke extends BIcycle {
	String indicator;
	
	
	
	
	 public RoadBIke(int startCadence, int startSpeed, int startGear, String indicator) {
		super(startCadence, startSpeed, startGear);
		this.indicator = indicator;
	}

	String leftIndicator(){
		
		 return "goleft";
		
	}
	String RightIndicator(){
		
		 return "goright";
		
	}
	
	void definition(){
		System.out.println("The term road bicycle is used to describe bicycles built for traveling at speed on paved road");
	}
	 
	void Brands(){
		System.out.println("Colnago \nSpecialized \nwiller  \nCampagnolo Cylcling");
	}

	
}
