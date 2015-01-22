package House;

public class HouseDirector {
	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructHouse() {
		houseBuilder.buildFloors();
		houseBuilder.buildDoors();
		houseBuilder.buildRooms();
		houseBuilder.buildWindows();
		houseBuilder.buildMaterials();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
