package Cycle;

public class testBiCycleHierarchy {

	public static void main(String[] args) {
		System.out.println("TandemBike:  "
				+ "\n ");
		
		TandemBike bike1=new TandemBike();
		bike1.definition();
		bike1.Brands();
		System.out.println("TandemBike:  "
				+ "\n ");
		MountainBike bikemodel2=new MountainBike();
		bikemodel2.Definition();
		bikemodel2.Brands();
		System.out.println("TandemBike:  "
				+ "\n ");
		RoadBIke bikemodel3=new RoadBIke();
		bikemodel3.definition();
		bikemodel3.Brands();
		// TODO Auto-generated method stub

	}

}
