package House;

public class DogHouseBuilder implements HouseBuilder {
	private House house;

	public DogHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildFloors() {
		this.house.setFloors(Floor.ONE);

	}

	@Override
	public void buildRooms() {
		this.house.setRooms(1);

	}

	@Override
	public void buildWindows() {
		this.house.setWindows(0);

	}

	@Override
	public void buildDoors() {
		this.house.setDoors(1);

	}

	@Override
	public void buildMaterials() {
		this.house.addMaterial("cloves");
		this.house.addMaterial("wood");
		this.house.addMaterial("painting");

	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
