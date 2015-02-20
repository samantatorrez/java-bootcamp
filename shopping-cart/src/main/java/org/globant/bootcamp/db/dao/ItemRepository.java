package org.globant.bootcamp.db.dao;

import java.util.List;

import org.globant.bootcamp.db.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long>{
	
	Item findById(Long id);
	
	Item findByName(String name);
	
	List<Item> findByIdCategory(Long idCategory);
	
	
}
