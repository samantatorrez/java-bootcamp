package Hospital;

import java.util.Vector;

public abstract class User {
	private String id;
	private String name;
	private String surname;

	public User(String id, String name, String surname) {
		this.setId(id);
		this.setName(name);
		this.setSurname(surname);
	}

	public abstract Vector<User> getDoctor(String id);

	public abstract Vector<User> getPatiente(String id);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
