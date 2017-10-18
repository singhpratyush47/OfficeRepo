package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class D3servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public D3servlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		ArrayList<Persons> al=(ArrayList<Persons>) new ConnectionHelper().getData();
		JsonUtil ju=new JsonUtil();
		String json=ju.convertToJson(al);
	    response.getWriter().print(json);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
