package org.globant.bootcamp.server;

import org.globant.bootcamp.db.dao.UserRepository;
import org.globant.bootcamp.db.entity.User;
import org.globant.bootcamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User add(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findById(long id) {
		return userRepository.findById(id);
	}

	@Override
	public User remove(User user) {
		user.setActive(false);
		return userRepository.save(user);
	}

	@Override
	public User findByLogin(String login) {
		return userRepository.findByLogin(login);
	}

}
