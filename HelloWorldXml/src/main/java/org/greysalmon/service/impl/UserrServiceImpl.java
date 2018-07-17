package org.greysalmon.service.impl;

import java.util.List;

import org.greysalmon.dao.UserrDao;
import org.greysalmon.model.Userr;
import org.greysalmon.service.UserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userrService")
// the annotation on the class level makes all the methods transactional
// any exception will cause rollback
// propagation - if tables are related action in the one should invoke action in the related one (e.g. delete)
@Transactional(propagation=Propagation.SUPPORTS, rollbackFor=Exception.class)
public class UserrServiceImpl implements UserrService {
	// all the methods in the Service Layer use the methods form the DAO Layer

	@Autowired
	UserrDao userrDao;
	
	@Override
	public void create(Userr userr) {
		userrDao.create(userr);
	}

	@Override
	public void update(Userr userr) {
		userrDao.update(userr);
	}

	@Override
	public Userr edit(Long userrId) {
		return userrDao.edit(userrId);
	}

	@Override
	public void delete(Long userrId) {
		userrDao.delete(userrId);
	}

	@Override
	public Userr find(Long userrId) {
		return userrDao.find(userrId);
	}

	@Override
	public List<Userr> getAll() {
		return userrDao.getAll();
	}

}
