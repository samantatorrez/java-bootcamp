package bootcamp412.topic4_user;

import java.awt.image.BufferedImage;

public class ProxyService implements Service {
	private Service service;

	public ProxyService() {
		this.service = new UserService();
	}

	public void create(String email, String name, String pass) {
		this.service.create(email, name, pass);
	}

	public User read(String email) {
		return this.service.read(email);
	}

	public void update(String email, String name, String pass) {
		this.service.update(email, name, pass);
	}

	public void delete(String email) {
		this.service.delete(email);
	}

	public void uploadPhoto(String email, String id, BufferedImage photo) {
		this.service.uploadPhoto(email, id, photo);
	}

	public void addFriend(String email, String friend) {
		this.service.addFriend(email, friend);
	}

	public void addLikes(String email, String photoId) {
		this.service.addLikes(email, photoId);
	}

}
