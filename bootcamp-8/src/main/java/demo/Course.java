package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="courses")
public class Course {

	private int hours; 
	private int schedule; 
	private String teacher;
	@Id
	private String courseName; 

	public Course(String courseName, int hours, int schedule, String teacher) {
		this.courseName = courseName;
		this.hours = hours;
		this.schedule = schedule;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", hours=" + hours + ", scheduleTime=" + schedule + ", idTeacher=" + teacher
				+ "]";
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		this.courseName = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getScheduleTime() {
		return schedule;
	}

	public void setScheduleTime(int scheduleTime) {
		this.schedule = scheduleTime;
	}

	public String getIdTeacher() {
		return teacher;
	}

	public void setIdTeacher(String id) {
		this.teacher = id;
	}

}
