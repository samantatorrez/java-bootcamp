package courses;

import java.util.List;

import app.Template;

public class CourseJDBCTemplate extends Template implements CourseDao {

	@Override
	public List<Course> listCourses() {
		String SQL = "select * from Course";
		List<Course> courses = jdbcTemplateObject.query(SQL, new CourseMapper());
		return courses;
	}

	@Override
	public void add(String courseName, int hours, int scheduleTime, String idTeacher) {
		String SQL = "insert into Course (course_name,hours_by_week, schedule_time, teacher_id) values (?, ?, ?, ?)";

		jdbcTemplateObject.update(SQL, courseName, hours, scheduleTime, idTeacher);

	}

}
