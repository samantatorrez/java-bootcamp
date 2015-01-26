package bootcamp412.topic4_user;

import java.awt.image.BufferedImage;

public class Photo {
	private String id;
	private int like;
	private BufferedImage image;

	public Photo(BufferedImage image) {
		this.image = image;
		this.like = 0;
	}

	public void addLike() {
		like++;
	}
}
