package com.ellipsilon.javaee7example.ejb.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.PersistenceContext;

import com.ellipsilon.javaee7example.ejb.entity.User;

@Stateless
public class UserDao {

	@PersistenceContext(unitName = "hello")
	private EntityManager manager;

	public List<User> listUsers() {
		Query query = manager.createQuery("select u from User u");
		return (List<User>) query.getResultList();
	}

}

