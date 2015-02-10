package students;

import java.sql.Date;
import java.util.List;

public interface StudentDao {
	public List<Student> listStudents();

	public void add(String name, String lastName, int id, Date birth);

}
