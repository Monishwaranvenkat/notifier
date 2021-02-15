package com.example.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.demo.DAO.NoteBookDAO;
import com.example.demo.model.NoteBook;
import com.example.demo.model.User;

public class NoteBookServlet extends HttpServlet {

	
	
	 public void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	    {
		 
		 	HttpSession session=request.getSession();
		 	User user=(User)session.getAttribute("userobj");
		 	
		 	NoteBookDAO notebook=new NoteBookDAO();
		 	
		 	List<NoteBook> notebooks =notebook.listOfNoteBook(user);
		 	
		 	System.out.println(notebooks);
		 	
		 	request.setAttribute("NoteBookList", notebooks);
		 	request.setAttribute("user",user);
	    	request.getRequestDispatcher("/notebook.jsp").forward(request, response);
	    }
	    
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	    {
	    	System.out.println("post");
	    	request.getRequestDispatcher("/notebook.jsp").forward(request, response);
	    }
	    
	   
	    
}
