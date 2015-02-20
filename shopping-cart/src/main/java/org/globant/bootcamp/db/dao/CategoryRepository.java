package org.globant.bootcamp.db.dao;

import org.globant.bootcamp.db.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	Category findById(Long id);

	Category findByName(String name);

}
