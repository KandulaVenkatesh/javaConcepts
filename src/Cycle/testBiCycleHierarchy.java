package Cycle;

public class testBiCycleHierarchy {

	public static void main(String[] args) {
		System.out.println("TandemBike:  "
				+ "\n ");
		
		TandemBike bike1=new TandemBike(2,3,4,9);
		bike1.definition();
		bike1.Brands();
		System.out.println("MountainBike:  "
				+ "\n ");
		MountainBike bikemodel2=new MountainBike(1,2,1,4);
		bikemodel2.Definition();
		bikemodel2.Brands();
		System.out.println("RoadBike:  "
				+ "\n ");
		RoadBIke bikemodel3=new RoadBIke(2,6,4,"left");
		bikemodel3.definition();
		bikemodel3.Brands();
		// TODO Auto-generated method stub

	}

}
