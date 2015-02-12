package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="assists")
public class StudentAssistCourse {
	@Id
	private String idAssists;
	private String student;// Student_registration_number
	private String course; // Course_name
	private double partial_1;// first_partial
	private double partial_2;// second_partial
	private double partial_3;// third_partial
	private double finalNote;// final

	
	public StudentAssistCourse(String idAssists, String student, String course, double partial_1, double partial_2,
			double partial_3, double finalNote) {
		this.idAssists = idAssists;
		this.student = student;
		this.course = course;
		this.partial_1 = partial_1;
		this.partial_2 = partial_2;
		this.partial_3 = partial_3;
		this.finalNote = finalNote;
	}
	
	@Override
	public String toString() {
		return "StudentAssistCourse [idAssists=" + idAssists + ", idStudent=" + student + ", courseName=" + course
				+ ", firstPartial=" + partial_1 + ", secondPartial=" + partial_2 + ", thirdPartial=" + partial_3 + ", finalNote="
				+ finalNote + "]";
	}

	public String getIdStudent() {
		return student;
	}

	public void setIdStudent(String idStudent) {
		this.student = idStudent;
	}

	public String getCourseName() {
		return course;
	}

	public void setCourseName(String courseName) {
		this.course = courseName;
	}

	public double getFirstPartial() {
		return partial_1;
	}

	public void setFirstPartial(double firstPartial) {
		this.partial_1 = firstPartial;
	}

	public double getSecondPartial() {
		return partial_2;
	}

	public void setSecondPartial(double secondPartial) {
		this.partial_2 = secondPartial;
	}

	public double getThirdPartial() {
		return partial_3;
	}

	public void setThirdPartial(double thirdPartial) {
		this.partial_3 = thirdPartial;
	}

	public double getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(double finalNote) {
		this.finalNote = finalNote;
	}

	public String getIdAssists() {
		return idAssists;
	}

	public void setIdAssists(String idAssists) {
		this.idAssists = idAssists;
	}
}
