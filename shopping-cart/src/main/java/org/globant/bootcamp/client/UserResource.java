package org.globant.bootcamp.client;

import org.globant.bootcamp.db.entity.User;

public interface UserResource {

	public User login(String username, String password);
	
}
