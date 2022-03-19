package com.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.*;
import com.bookstore.dao.UserDao;
import com.bookstore.entity.*;
import com.bookstore.db.*;

/**
 * Servlet implementation class RegisterServlet
 */

@MultipartConfig
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		
			String first_name=request.getParameter("fname");
			String address=request.getParameter("address");
			String email=request.getParameter("uemail");
			String uname=request.getParameter("name");
			String pass=request.getParameter("upass");
//			user object save all data to user object
			
			User user=new User(first_name, address,  email,  uname,  pass);
//			user dao object
			UserDao dao=new UserDao(jdbcconnection.getConnection());
			if(dao.saveUser(user)) {
				out.println("Register");
				response.sendRedirect("Login.jsp");

				
			}
			else {
				out.println("Registratin failed!!");
			}
		}
		
	
	}


