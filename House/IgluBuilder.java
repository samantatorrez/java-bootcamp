package House;

public class IgluBuilder implements HouseBuilder {
	private House house;

	public IgluBuilder() {
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
		this.house.addMaterial("snow");
		this.house.addMaterial("snow blocks");

	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
