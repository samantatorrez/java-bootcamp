package House;

public class Demo {

	public static void main(String[] args) {
		HouseBuilder dogHome = new DogHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(dogHome);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println(house.toString());

		HouseBuilder snowHome = new IgluBuilder();
		houseDirector = new HouseDirector(snowHome);
		houseDirector.constructHouse();
		house = houseDirector.getHouse();
		System.out.println(house.toString());
	}

}
