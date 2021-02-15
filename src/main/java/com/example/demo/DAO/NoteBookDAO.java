package com.example.demo.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.example.demo.model.NoteBook;
import com.example.demo.model.User;

public class NoteBookDAO {
	
	
	public void createNoteBook(NoteBook notebook) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try
		{
		 session.beginTransaction();
		 session.save(notebook);
		 session.getTransaction().commit();
		}catch (HibernateException e) {
	         if (session.getTransaction()!=null) session.getTransaction().rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	}
	
	
	public void updateNoteBook(Integer id, String notebookName) {
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try
		{
			
		 session.beginTransaction();
		 NoteBook noteBook = (NoteBook) session.get(NoteBook.class, id);
		 noteBook.setNoteBookName(notebookName);
		 session.update(noteBook);
		 session.getTransaction().commit();
		 
		}catch (HibernateException e) {
			
	         if (session.getTransaction()!=null) session.getTransaction().rollback();
	         e.printStackTrace(); 
	         
	      } finally {
	         session.close(); 
	      }
		
	}
	
	
	public List<NoteBook> listOfNoteBook(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 List<NoteBook> list=null;
		try
		{
		// session.beginTransaction();
		 Criteria criteria=session.createCriteria(NoteBook.class);
		 criteria.add(Restrictions.eq("user", user));
		  list = criteria.list();
		// session.getTransaction().commit();
		 
		}catch (HibernateException e) {
			
	        // if (session.getTransaction()!=null) session.getTransaction().rollback();
	         e.printStackTrace(); 
	         
	      } finally {
	         session.close(); 
	      }
		
		return list;	
	}
	
	

}
