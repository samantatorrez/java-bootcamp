package org.globant.bootcamp.db.dao;

import org.globant.bootcamp.db.entity.WishList;
import org.springframework.data.repository.CrudRepository;

public interface WishListRepository extends CrudRepository<WishList, Long> {

	WishListRepository findById(Long id);
}
