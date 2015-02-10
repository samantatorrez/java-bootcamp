package courses;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course course = new Course();
		course.setIdTeacher(rs.getString("teacher_id"));
		course.setCourseName(rs.getString("course_name"));
		course.setHours(rs.getInt("hours_by_week"));
		course.setScheduleTime(rs.getInt("schedule_time"));
		return course;
	}

}
