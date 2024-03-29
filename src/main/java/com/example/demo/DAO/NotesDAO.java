package com.example.demo.DAO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.example.demo.model.Note;
import com.example.demo.model.NoteBook;
import com.example.demo.model.Status;
import com.example.demo.model.Tag;
import com.example.demo.model.User;


@SuppressWarnings({"deprecation","unchecked"})
public class NotesDAO {

	public Integer getNumberOfNotes(NoteBook noteBook) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Criteria criteria = session.createCriteria(Note.class);
			criteria.add(Restrictions.eq("noteBook", noteBook));
			criteria.setProjection(Projections.rowCount());
			return (int) (long) criteria.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
	}

	public void createNote(Note noteObj) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Status status = noteObj.getStatus();
			Tag tag = noteObj.getTag();
			session.save(status);
			session.save(tag);
			session.save(noteObj);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public List<Note> listOfNotes(Integer id) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Note> list = null;
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Note.class);
			criteria.add(Restrictions.eq("noteBook.id", id));
			list = criteria.list();

		} catch (HibernateException e) {

			e.printStackTrace();

		} finally {
			session.close();
		}

		return list;

	}

	public Note getNoteObject(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();

			Criteria criteria = session.createCriteria(Note.class);
			criteria.add(Restrictions.eq("id", id));
			return (Note) criteria.uniqueResult();

		} catch (HibernateException e) {

			e.printStackTrace();

		} finally {
			session.close();
		}
		return null;

	}
	
	public void updateNote(Note noteObj) {
	
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		try
		{
			session.beginTransaction();
			Status status = noteObj.getStatus();
			Tag tag = noteObj.getTag();
			 session.update(status);
			 session.update(tag);
			 session.update(noteObj);
		 session.getTransaction().commit();
		 
		}catch (HibernateException e) {
			
	         if (session.getTransaction()!=null) session.getTransaction().rollback();
	         e.printStackTrace(); 
	         
	      } finally {
	         session.close(); 
	      }
	}

	public void deleteNote(Note note) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			session.beginTransaction();
			session.delete(note);
			session.getTransaction().commit();
		} catch (HibernateException e) {

			e.printStackTrace();

		} finally {
			session.close();
		}

	}
	
	public List<Note> getNotesByReminder(NoteBook noteBook,Date date)
	{
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
				
				Criteria criteria =session.createCriteria(Note.class);
				criteria.add(Restrictions.eq("remainderDate", date));
				criteria.add(Restrictions.eq("noteBook", noteBook));
				List<Note> list = criteria.list();
				return (ArrayList<Note>) list;
		} catch (HibernateException e) {

			e.printStackTrace();
			return null;

		} finally {
			session.close();
		}
		
	}
	
	
	public ArrayList<Note> listAllNotes(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try
		{
			Criteria criteria =session.createCriteria(Note.class);
			criteria.createAlias("noteBook","noteBook");
			criteria.add(Restrictions.eq("noteBook.user", user));
			List<Note> list = criteria.list();
			return (ArrayList<Note>) list;
		}catch (HibernateException e) {

			e.printStackTrace();
			return null;

		} finally {
			session.close();
		}
		
	
	}

}
