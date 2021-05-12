package com.example.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.demo.DAO.UserDAO;
import com.example.demo.model.User;

public class EditUserServlet extends HttpServlet {
	


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
    	String userName = request.getParameter("username");
    	String mobileNumber = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        HttpSession session=request.getSession();
	 	User user=(User)session.getAttribute("userobj");
	 	String preEmail=user.getEmail();
	 	user.setUserName(userName);
	 	user.setEmail(email);
	 	user.setMobileNumber(mobileNumber);
	 	user.setPassword(password);
        
        System.out.print(email+"--------------------");
        System.out.println(user);
        
        UserDAO userDAO = new UserDAO();  
        User userObj=userDAO.getUserObj(email);
		if(userObj==null || userObj.getEmail().equals(preEmail)) {
			
			userDAO.updateUser(user);
			session.setAttribute("userobj", user);
		}
		else
		{
			
		 	
			System.out.println("error-----------------");
			request.setAttribute("errMessage","Email already used by another user" );

		}
		
		request.setAttribute("user", (User)session.getAttribute("userobj"));
		
    	request.getRequestDispatcher("/EditUser.jsp").forward(request, response);
    }
    
    
    
    public void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	HttpSession session=request.getSession();
	 	User user=(User)session.getAttribute("userobj");
	 	request.setAttribute("user", user);
    	request.getRequestDispatcher("/EditUser.jsp").forward(request, response);
    }
    
   

}
