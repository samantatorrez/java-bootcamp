package studentAssistCourse;

import java.util.List;

import students.Student;
import courses.Course;

public interface StudentAssistCourseDao {
	public List<Course> listCourses(int studentId);

	public List<Student> listStudents(String course);
}
