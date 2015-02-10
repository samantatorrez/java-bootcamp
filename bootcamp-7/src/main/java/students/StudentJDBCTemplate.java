package students;

import java.sql.Date;
import java.util.List;
import app.Template;

public class StudentJDBCTemplate extends Template implements StudentDao {

	@Override
	public void add(String name, String lastName, int id, Date birth) {
		String SQL = "insert into Student (registration_number,student_first_name, student_last_name, student_date_of_birth) values (?, ?, ?, ?)";

		jdbcTemplateObject.update(SQL, id, name, lastName, birth);
	}

	@Override
	public List<Student> listStudents() {
		String SQL = "select * from student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}

}
