package teachers;

import java.sql.Date;
import java.util.List;

public interface TeacherDao {
	public List<Teacher> listTeachers();

	public void add(String name, String lastName, String id, Date birth);
}
