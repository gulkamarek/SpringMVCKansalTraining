package org.greysalmon.dao.impl;

import java.util.List;

import org.greysalmon.dao.UserrDao;
import org.greysalmon.model.Userr;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// Marker stereotype(package in spring) annotation all the the same task = instantiate a bean in IOC container
@Repository("userrDao") // name of the bean that will be created
public class UserrDaoImpl implements UserrDao {

	// to access the DB a session object is needed thus session factory from
	// hibernate will be used to get the reference to the current session (or
	// create a new)
	// With the help of session object it will be possible to query the DB.
	@Autowired
	SessionFactory sessionFactory;

	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void create(Userr userr) {
		// the below line is HQL that will be translated by hibernate to SQL by
		// use of the dialect defined in the spring-servlet.xml. Thanks to it it
		// is DB independent.
		currentSession().save(userr);

	}

	@Override
	public void update(Userr userr) {
		currentSession().update(userr);
	}

	@Override
	public Userr edit(Long userrId) { 
		// it finds the object in the DB and returns it the it will be edited and then update it to the DB.
		// 
		return find(userrId);
	}

	@Override
	public void delete(Long userrId) {
		// currentSession().delete(userrId); // this didn't work
		currentSession().delete(find(userrId));
	}

	@Override
	public Userr find(Long userrId) {
		// it returns Object type so it must be casted
		return (Userr)currentSession().get(Userr.class, userrId);// primary key in arg
	}

	@Override
	public List<Userr> getAll() {
		// all records of the type user will be returned as a list
		return currentSession().createCriteria(Userr.class).list();
	}

}
