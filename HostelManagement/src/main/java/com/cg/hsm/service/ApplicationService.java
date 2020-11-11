package com.cg.hsm.service;

import java.util.List;

import com.cg.hsm.entity.ApplicationEntity;


public interface ApplicationService {

	public long add(ApplicationEntity entity);
	public void update(ApplicationEntity entity);
	public void delete(ApplicationEntity entity);
	public ApplicationEntity findByName(String name);
	public ApplicationEntity findByPk(long id);
	public List<ApplicationEntity> search(ApplicationEntity entity, long pageNo, int pageSize);
	public List<ApplicationEntity> search(ApplicationEntity entity);
	
	
}
