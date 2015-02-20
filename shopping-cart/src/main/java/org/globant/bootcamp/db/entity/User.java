package org.globant.bootcamp.db.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "User")
public class User implements Serializable {

	private static final long serialVersionUID = -4438193883988354315L;

	@Id
	@GeneratedValue
	private Long idUser;

	private String name;

	private String login;

	private boolean active;

	private String password;

	public User(Long id, String name, String login, boolean active, String password) {
		this.idUser = id;
		this.name = name;
		this.login = login;
		this.active = active;
		this.password = password;
	}

	public Long getId() {
		return idUser;
	}

	public void setId(Long id) {
		this.idUser = id;
	}

	public boolean isActive() {
		return active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
