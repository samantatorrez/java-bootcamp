package studentAssistCourse;

import java.util.List;

import students.Student;
import students.StudentMapper;
import courses.Course;
import courses.CourseMapper;
import app.Template;

public class StudentAssistCourseTemplate extends Template implements StudentAssistCourseDao {

	@Override
	public List<Course> listCourses(int studentId) {
		String SQL = "select * from student_assist_course JOIN Course " + "ON student_assist_course.Course_name= Course.course_name "
				+ "WHERE Student_registration_number=? ";
		List<Course> courses = jdbcTemplateObject.query(SQL, new Object[] { studentId }, new CourseMapper());
		return courses;

	}

	@Override
	public List<Student> listStudents(String course) {
		String SQL = "select * from student_assist_course JOIN Student "
				+ "ON student_assist_course.Student_registration_number= Student.registration_number " + "WHERE course_name=? ";
		List<Student> students = jdbcTemplateObject.query(SQL, new Object[] { course }, new StudentMapper());
		return students;
	}

}
