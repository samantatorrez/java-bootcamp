package Hospital;

import java.util.Vector;

public class Doctor extends User {
	private String specialization;
	private int workingHours;

	public Doctor(String id, String name, String surname, String specialization, int workingHours) {
		super(id, name, surname);
		setSpecialization(specialization);
		setWorkingHours(workingHours);

	}

	@Override
	public Vector<User> getDoctor(String id) {
		Vector<User> doctor = new Vector<User>();
		doctor.add(this);
		return doctor;
	}

	@Override
	public Vector<User> getPatiente(String id) {
		Vector<User> patient = new Vector<User>();
		return patient;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

}
