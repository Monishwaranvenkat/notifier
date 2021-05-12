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
import com.example.demo.DAO.NotesDAO;
import com.example.demo.DAO.Notification;
import com.example.demo.model.Note;
import com.example.demo.model.NoteBook;
import com.example.demo.model.User;

public class AllNotesServlet extends HttpServlet{

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		HttpSession session=request.getSession();
		Notification notification = new Notification();
		User user=(User)session.getAttribute("userobj");
	 	List<Note> reminderList =notification.getNotification(user);
	 	request.setAttribute("reminderList", reminderList);
		request.getRequestDispatcher("/AllNotes.jsp").forward(request, response);
	
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		
	 	
	 	
		HttpSession session=request.getSession();
	 	User user=(User)session.getAttribute("userobj");
		
		NotesDAO notesdao = new NotesDAO();
		List<Note> notelist =notesdao.listAllNotes(user);
		
		Notification notification = new Notification();
		
	 	List<Note> reminderList =notification.getNotification(user);
	 	request.setAttribute("reminderList", reminderList);
		request.setAttribute("NoteList", notelist);
	 	
		request.getRequestDispatcher("/AllNotes.jsp").forward(request, response);

	}
}