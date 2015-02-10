package teachers;

import java.sql.Date;
import java.util.List;

import app.Template;

public class TeacherJDBCTemplate extends Template implements TeacherDao {

	@Override
	public List<Teacher> listTeachers() {
		String SQL = "select * from teacher";
		List<Teacher> teachers = jdbcTemplateObject.query(SQL, new TeacherMapper());
		return teachers;
	}

	@Override
	public void add(String name, String lastName, String id, Date birth) {
		String SQL = "insert into Teacher (teacher_id,first_name,last_name, date_of_birth) values (?, ?, ?, ?)";
		jdbcTemplateObject.update(SQL, id, name, lastName, birth);

	}

}
