package org.globant.bootcamp.client;

import org.globant.bootcamp.db.entity.User;
import org.globant.bootcamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserClient implements UserResource {
	
	private UserService proxy;
	
	@Autowired
	public UserClient(@Qualifier("userService") UserService proxy){
		this.proxy = proxy;
	}

	@Override
	public User login(String login, String password) {
		return proxy.findByLogin(login);
	}

	
	
}
