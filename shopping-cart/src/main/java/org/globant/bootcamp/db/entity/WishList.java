package org.globant.bootcamp.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "WishList")
public class WishList implements Serializable {

	private static final long serialVersionUID = -3338193883988354315L;

	@Id
	@GeneratedValue
	private Long idWishList;
	
	
	@Column(name = "User_idUser")
	private Long idUser;

	public WishList(Long idWishList, Long idUser) {
		this.idWishList = idWishList;
		this.idUser = idUser;
	}

	public Long getId() {
		return idWishList;
	}

	public void setId(Long id) {
		this.idWishList = id;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
}
