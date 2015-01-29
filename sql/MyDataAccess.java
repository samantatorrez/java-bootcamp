import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDataAccess {

	private String _usuario="root";
	private String _pwd= "greiscol";
	private static String _bd="high-school";
	static String _url = "jdbc:mysql://localhost/"+_bd;
	private Connection conn = null;
	
	public MyDataAccess() {
		
		try{
			Class.forName("com.mysql.jdbc.Connection");
			conn = (Connection)DriverManager.getConnection(_url, _usuario, _pwd);
			if(conn != null)
			{
				System.out.println("Conexi-n a base de datos "+_url+" . . . Ok");
			}
		}
		catch(SQLException ex)
		{
			System.out.println("Hubo un problema al intentar conecarse a la base de datos"+_url);
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex);
		}		
	}
	
	public ResultSet getQuery(String _query)
	{
		Statement state = null;
		ResultSet resultado = null;
		try{
			state = (Statement) conn.createStatement();
			resultado = state.executeQuery(_query);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		
		}
		return resultado;
	}
	public void listGivenStudent(int studentNum){
		ResultSet result;
		String student;
		String course;
		String finalNote;
		
		result = this.getQuery("SELECT CONCAT(student_last_name,',',student_first_name) as Student, course.course_name as Course, "
				+ "final FROM (course INNER JOIN student_assist_course ON course.course_name=student_assist_course.Course_name) "
				+ "INNER JOIN student ON student_assist_course.Student_registration_number=student.registration_number "
				+ "WHERE student_registration_number= "+ studentNum
				+ " ORDER BY course.course_name ASC, final ASC;");
		System.out.println("Student     "+"Course             "+"Final");
		try {
			while(result.next()){
				student= result.getString("Student");
				course= result.getString("Course");
				finalNote= result.getString("final");
				System.out.println(student+"   "+course+"             "+finalNote);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void listGivenCourse(String courseName){
		ResultSet result;
	    result = this.getQuery("SELECT course.course_name as Course, "
	    		+ "CONCAT(last_name,',',first_name) as Teacher, "
	    		+ "CONCAT(student_last_name,',',student_first_name) as Student "
	    		+ "FROM ((teacher INNER JOIN course ON teacher.teacher_id=course.Teacher_id) "
	    		+ "INNER JOIN student_assist_course ON course.course_name=student_assist_course.Course_name) "
	    		+ "INNER JOIN student ON student_assist_course.Student_registration_number=student.registration_number "
	    		+ "WHERE course.course_name= '"+courseName+"' " 
	    		+ "ORDER BY course.course_name ASC, student_last_name ASC;");
		try {
	    	boolean first=true;
	    	while(result.next()){
	    		if(first){
			String course= result.getString("Course");
			String teacher= result.getString("Teacher");
			System.out.println("Course: "+ course);
			System.out.println("Teacher: "+ teacher);
			System.out.println("Students:");
	    	first=false;}
	    		String student= result.getString("Student");
	    		System.out.println("	"+student);
	    		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setQuery(String _query){

		Statement state = null;
		
		try{			
			state=(Statement) conn.createStatement();
			state.execute(_query);

         } catch (SQLException e){
            e.printStackTrace();
       }
	}
}