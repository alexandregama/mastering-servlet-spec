package com.mastering.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello-world")
public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1622048050778470434L;
	
	@Inject
	private MyLogger logger;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		writer.write("Its working!");
		
		logger.log("Its CDI working!");
	}

}
