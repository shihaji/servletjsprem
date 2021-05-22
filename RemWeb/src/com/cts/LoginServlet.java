package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(
		urlPatterns = { "/logServlet" }, 
		initParams = { 
				@WebInitParam(name = "location", value = "chennai")
		})
public class LoginServlet extends HttpServlet {
	
	
         	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		HttpSession session=request.getSession();
		
		request.getServletContext().setAttribute("contextName", name);
		
		session.setAttribute("sessionName",name);
		
		if(name.equals("cts")&& password.equals("1234")) {
			//response.sendRedirect("home.jsp");  // redirection is done by browser, url changes
			
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp"); // redirection done by server
			rd.forward(request, response);                           // url wont change
			
			
		}else {
			response.sendRedirect("index.jsp");
		}
		
		
		
				
	}
	
	

		
	
}
