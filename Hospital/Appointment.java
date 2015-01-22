package Hospital;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
	private Date date;
	private User doctor;
	private User patient;

	public Appointment(Date date, User doctor, User patient) {
		this.setDate(date);
		this.setDoctor(doctor);
		this.setPatient(patient);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getDoctor() {
		return doctor;
	}

	public void setDoctor(User doctor) {
		this.doctor = doctor;
	}

	public User getPatient() {
		return patient;
	}

	public void setPatient(User patient) {
		this.patient = patient;
	}

	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return "Appointment date: " + dateFormat.format(this.date) + " - Doctor: " + this.doctor.getSurname() + " Patient: "
				+ this.patient.getSurname();
	}
}
