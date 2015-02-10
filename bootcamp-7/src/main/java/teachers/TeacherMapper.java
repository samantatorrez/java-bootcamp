package teachers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TeacherMapper implements RowMapper<Teacher> {

	@Override
	public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Teacher teacher = new Teacher();
		teacher.setId(rs.getString("teacher_id"));
		teacher.setName(rs.getString("first_name"));
		teacher.setLastName(rs.getString("last_name"));
		teacher.setBirth(rs.getDate("date_of_birth"));
		return teacher;
	}

}
