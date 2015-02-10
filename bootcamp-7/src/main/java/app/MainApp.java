package app;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import courses.Course;
import courses.CourseJDBCTemplate;
import studentAssistCourse.StudentAssistCourseTemplate;
import students.Student;
import students.StudentJDBCTemplate;
import teachers.Teacher;
import teachers.TeacherJDBCTemplate;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		Date date = new Date(1990 - 01 - 01);
		// insert student
		studentJDBCTemplate.add("Magnus", "Bane", 51, date);
		System.out.println("------Listing Students--------");
		List<Student> students = studentJDBCTemplate.listStudents();
		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println();
		}

		TeacherJDBCTemplate teacherJDBCTemplate = (TeacherJDBCTemplate) context.getBean("teacherJDBCTemplate");
		// insert teacher
		teacherJDBCTemplate.add("Simon", "Snow", "T4", new Date(1990 - 02 - 01));
		System.out.println("------Listing Teachers--------");
		List<Teacher> teachers = teacherJDBCTemplate.listTeachers();
		for (Teacher record : teachers) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println();
		}

		CourseJDBCTemplate courseJDBCTemplate = (CourseJDBCTemplate) context.getBean("courseJDBCTemplate");
		// insert Course
		courseJDBCTemplate.add("Math", 4, 2, "T4");
		System.out.println("------Listing Courses--------");
		List<Course> courses = courseJDBCTemplate.listCourses();
		for (Course record : courses) {
			System.out.print("ID : " + record.getCourseName());
			System.out.print(", teacher : " + record.getIdTeacher());
			System.out.println();
		}
		System.out.println("............list students of a given course............................");

		StudentAssistCourseTemplate studentAssistCourseTemplate = (StudentAssistCourseTemplate) context
				.getBean("studentAssistCourseTemplate");
		students = studentAssistCourseTemplate.listStudents("biology");
		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println();
		}

		System.out.println("...........list courses of a given student............................");
		courses = studentAssistCourseTemplate.listCourses(1);
		for (Course record : courses) {
			System.out.print("ID : " + record.getCourseName());
			System.out.print(", Teacher id : " + record.getIdTeacher());
			System.out.println();
		}

	}

}
