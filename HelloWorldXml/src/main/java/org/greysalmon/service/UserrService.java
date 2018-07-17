package org.greysalmon.service;

import java.util.List;

import org.greysalmon.model.Userr;

public interface UserrService {
	
	public void create(Userr userr);
	public void update(Userr userr);
	public Userr edit(Long userrId);
	public void delete(Long userrId);
	public Userr find(Long userrId);
	public List<Userr> getAll();

}
