package Hospital;

import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;

public class Patient extends User {
	private String state;
	private Hashtable<Date, String> medicalHistory;

	public Patient(String id, String name, String surname, String state) {
		super(id, name, surname);
		this.setState(state);
		this.medicalHistory = new Hashtable<Date, String>();
	}

	public void addMedicalHistory(Date date, String note) {
		this.medicalHistory.put(date, note);
	}

	public String getMedicalHistory(Date date) {
		return this.getMedicalHistory(date);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public Vector<User> getDoctor(String id) {
		Vector<User> doctor = new Vector<User>();
		return doctor;
	}

	@Override
	public Vector<User> getPatiente(String id) {
		Vector<User> patient = new Vector<User>();
		patient.add(this);
		return patient;
	}

}
