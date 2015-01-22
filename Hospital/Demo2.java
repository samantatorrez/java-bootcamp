package Hospital;

import java.util.Date;

public class Demo2 {

	public static void main(String[] args) {
		Hospital santamarina = new Hospital();
		santamarina.setRooms(50);
		santamarina.setId("1234");
		User doctor1 = new Doctor("222", "John", "Smith", "pediatrician", 6);
		User patient1 = new Patient("333", "Robert", "Tate", "uncharged");
		santamarina.addUser(doctor1);
		santamarina.addUser(patient1);
		Date date = new Date();
		santamarina.addAppointment(doctor1, patient1, date);
		System.out.println(santamarina.getAppointments(date).toString());

	}

}
