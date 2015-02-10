package courses;

public class Course {
	private String courseName; // course_name
	private int hours; // hours_by_week
	private int scheduleTime; // schedule_time
	private String idTeacher; // teacher_id

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
		return scheduleTime;
	}

	public void setScheduleTime(int scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(String id) {
		this.idTeacher = id;
	}

}
