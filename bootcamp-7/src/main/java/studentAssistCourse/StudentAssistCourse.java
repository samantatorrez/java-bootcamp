package studentAssistCourse;

public class StudentAssistCourse {
	private int idStudent;// Student_registration_number
	private String courseName; // Course_name
	private double firstPartial;// first_partial
	private double secondPartial;// second_partial
	private double thirdPartial;// third_partial
	private double finalNote;// final

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFirstPartial() {
		return firstPartial;
	}

	public void setFirstPartial(double firstPartial) {
		this.firstPartial = firstPartial;
	}

	public double getSecondPartial() {
		return secondPartial;
	}

	public void setSecondPartial(double secondPartial) {
		this.secondPartial = secondPartial;
	}

	public double getThirdPartial() {
		return thirdPartial;
	}

	public void setThirdPartial(double thirdPartial) {
		this.thirdPartial = thirdPartial;
	}

	public double getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(double finalNote) {
		this.finalNote = finalNote;
	}
}
