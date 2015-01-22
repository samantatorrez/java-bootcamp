package Hospital;

import java.util.Date;
import java.util.Hashtable;

public class Hospital {
	private String id;
	private Hashtable<String, User> users;
	private int rooms;
	private Hashtable<Date, Appointment> appointments;

	public Hospital() {
		this.users = new Hashtable<String, User>();
		this.appointments = new Hashtable<Date, Appointment>();
	}

	public void addUser(final User user) {
		this.users.put(user.getId(), user);
	}

	public void addAppointment(User doctor1, User patient1, Date date) {
		if (this.appointments.containsKey(date)) {
			System.out.println("not available");
		} else {
			this.appointments.put(date, new Appointment(date, doctor1, patient1));
			System.out.println("ended successfully");
		}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Hashtable<String, User> getUsers() {
		return users;
	}

	public void setUsers(Hashtable<String, User> users) {
		this.users = users;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public Appointment getAppointments(Date date) {
		return this.appointments.get(date);
	}

	public void setAppointments(Hashtable<Date, Appointment> appointments) {
		this.appointments = appointments;
	}

}
