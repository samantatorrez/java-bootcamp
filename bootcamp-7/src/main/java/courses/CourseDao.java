package courses;

import java.util.List;

public interface CourseDao {
	public List<Course> listCourses();

	public void add(String courseName, int hours, int scheduleTime, String idTeacher);
}
