package com.example.demo.DAO;

import java.sql.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.example.demo.model.Note;
import com.example.demo.model.NoteBook;
import com.example.demo.model.User;

public class Notification {
	
	public List<Note> getNotification(User user)
	{
		NoteBookDAO noteBookDao = new NoteBookDAO();
		NotesDAO notesDao = new NotesDAO();
		List<NoteBook> noteBooks = noteBookDao.listOfNoteBook(user);
		List<Note> list=null;
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis); 
		
		for(NoteBook noteBook:noteBooks)
		{
			if(list!=null)
			list.addAll(notesDao.getNotesByReminder(noteBook, date));
			else
				list=notesDao.getNotesByReminder(noteBook, date);
		}		
		return list;	
	}

}
