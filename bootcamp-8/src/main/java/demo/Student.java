package demo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students" )
public class Student {


	private String name;
	private String lastName;
	private Date birth;
	@Id
	private String id;

	public Student(String name, String lastName, Date birth, String id) {
		this.name = name;
		this.lastName = lastName;
		this.birth = birth;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", birth=" + birth + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
