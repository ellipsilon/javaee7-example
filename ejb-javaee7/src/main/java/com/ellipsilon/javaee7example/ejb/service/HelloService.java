package com.ellipsilon.javaee7example.ejb.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.ellipsilon.javaee7example.ejb.dao.UserDao;

@Stateless
public class HelloService {

	@EJB
	private UserDao userDao;

	public String hello() {
		return "Hello EJB! " + userDao.listUsers();
	}

}
