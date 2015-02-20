package org.globant.bootcamp.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item implements Serializable {

	private static final long serialVersionUID = -5538193883988354315L;

	@Id
	@GeneratedValue
	private Long idItem;
	private int stock;
	private double unitPrice;
	private String name;
	@Column(name = "Category_idCategory")
	private Long idCategory;

	public Item(Long id, int stock, double unitPrice) {
		this.idItem = id;
		this.stock = stock;
		this.unitPrice = unitPrice;
	}

	public Long getId() {
		return idItem;
	}

	public void setId(Long id) {
		this.idItem = id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

}
