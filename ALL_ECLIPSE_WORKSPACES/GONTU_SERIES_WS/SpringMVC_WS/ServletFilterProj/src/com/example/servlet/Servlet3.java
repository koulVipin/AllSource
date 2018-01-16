package com.example.servlet;

import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
  
public class Servlet3 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
  
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
      
        out.print("<br>welcome to servlet3<br>");   
    }
}