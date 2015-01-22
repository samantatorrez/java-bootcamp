package House;

import java.util.Vector;

public class House {
	private Floor floors;
	private int rooms;
	private int windows;
	private int doors;
	private Vector<String> materials;

	public House() {
		this.materials = new Vector<String>();
	}

	public void addMaterial(String material) {
		this.materials.addElement(material);
	}

	public Floor getFloors() {
		return floors;
	}

	public void setFloors(Floor floors) {
		this.floors = floors;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public Vector<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Vector<String> materials) {
		this.materials = materials;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String materialsToString() {
		String aux = " ";
		for (int i = 0; i < this.materials.size(); i++) {
			aux = aux + " - " + this.materials.get(i);
		}
		return aux;
	}

	public String toString() {
		return "Number of floors: " + this.floors + "- Number of rooms: " + this.rooms + "- Number of windows: " + this.windows
				+ "- Number of doors: " + this.doors + "- Materials: " + materialsToString();
	}

}
