package com.example.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.demo.DAO.UserDAO;
import com.example.demo.model.User;

public class SignupServlet extends HttpServlet {
	


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
    	String userName = request.getParameter("username");
    	String mobileNumber = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User(userName, password, email, mobileNumber);
        UserDAO userDAO = new UserDAO();  
        User userObj=userDAO.getUserObj(email);
		if(userObj!=null) {
			
			request.setAttribute("errMessage","Email already exist please login to continue" );
		}
		else
		{
         	userDAO.createUser(user); 
		}
    	request.getRequestDispatcher("/signup.jsp").forward(request, response);
    }
    
    
    
    public void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	
    	request.getRequestDispatcher("/signup.jsp").forward(request, response);
    }
    
   

}
