/**
 * 
 */
package org.globant.bootcamp.service;

import org.globant.bootcamp.db.entity.User;

/**
 *
 */
public interface UserService {

	public User add(User user);
	
	public User findById(long id);
	
	public User remove(User user);

	public User findByLogin(String login);
	
}
