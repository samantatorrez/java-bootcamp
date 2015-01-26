package bootcamp412.topic4_user;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class UserService implements Service {
	private Map<String, User> users;

	public UserService() {
		this.users = new HashMap<String, User>();
	}

	public void create(String email, String name, String pass) {
		User user = new User(email, name, pass);
		users.put(email, user);
	}

	public User read(String id) {
		return users.get(id);
	}

	public void update(String email, String name, String pass) {
		users.get(email).setName(name);
		users.get(email).setPass(pass);
	}

	public void delete(String email) {
		users.remove(email);
	}

	public void uploadPhoto(String email, String id, BufferedImage photo) {
		users.get(email).addPhoto(id, new Photo(photo));
	}

	public void addFriend(String email, String friend) {
		if (users.containsKey(friend)) {
			users.get(email).addFriend(friend);
		}
	}

	public void addLikes(String email, String photoId) {
		users.get(email).addLike(photoId);
	}

}
