package org.globant.bootcamp.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wishlist_has_item")
public class WishListHasItem implements Serializable {

	private static final long serialVersionUID = -3493792707157620303L;

	@Column(name = "WishList_idWishList")
	private Long idWishList;
	@Column(name = "Item_idItem")
	private Long idItem;
	private int quantity;

	public WishListHasItem(Long idWishList, Long idItem, int quantity) {
		this.idWishList = idWishList;
		this.idItem = idItem;
		this.quantity = quantity;
	}

	public Long getIdWishList() {
		return idWishList;
	}

	public void setIdWishList(Long idWishList) {
		this.idWishList = idWishList;
	}

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
