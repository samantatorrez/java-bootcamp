package bootcamp412.topic4_user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
	private String email;
	private String name;
	private String pass;
	private Map<String, Photo> images;
	private List<String> friends;

	public User(String email, String name, String pass) {
		this.email = email;
		this.name = name;
		this.pass = pass;
		this.images = new HashMap<String, Photo>();
		this.friends = new ArrayList<String>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void addPhoto(String id, Photo image) {
		this.images.put(id, image);
	}

	public void addLike(String id) {
		this.images.get(id).addLike();
	}

	public void addFriend(String email) {
		this.friends.add(email);
	}

}
