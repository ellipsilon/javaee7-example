package com.ellipsilon.javaee7example.ejb.session;

import javax.ejb.Stateless;

@Stateless
public class HelloSessionBean {

	public String hello() {
		return "Hello EJB!";
	}

}

