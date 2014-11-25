package com.ellipsilon.javaee7example.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ellipsilon.javaee7example.ejb.session.HelloSessionBean;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@EJB
	private HelloSessionBean helloSessionBean;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("helloMessage", helloSessionBean.hello());
		request.getRequestDispatcher("/WEB-INF/pages/hello.jsp").forward(request, response);
	}

}

