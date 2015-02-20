package org.globant.bootcamp.db.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Table(name = "Category")
public class Category implements Serializable {
	private static final long serialVersionUID = -6338193883988354315L;

	@Id
	@GeneratedValue
	private Long idCategory;

	private String name;
	
	private String description;

	public Category(Long idCategory, String name, String description) {
		this.idCategory = idCategory;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return idCategory;
	}

	public void setId(Long id) {
		this.idCategory = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
