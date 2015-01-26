package bootcamp412.topic4_user;

import java.awt.image.BufferedImage;
import java.util.HashMap;

/**
 * Service interface Provides the functionalities of user management
 * 
 * @author Samanta
 */
public interface Service {

	public void create(String email, String name, String pass);

	public User read(String email);

	public void update(String email, String name, String pass);

	public void delete(String email);

	public void uploadPhoto(String email, String id, BufferedImage photo);

	public void addFriend(String email, String friend);

	public void addLikes(String email, String photoId);
}
