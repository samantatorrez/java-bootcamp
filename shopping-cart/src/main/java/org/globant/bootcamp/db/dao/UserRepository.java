package org.globant.bootcamp.db.dao;

import java.util.List;

import org.globant.bootcamp.db.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByName(String name);

	User findById(Long id);

	User findByLogin(String login);

}
