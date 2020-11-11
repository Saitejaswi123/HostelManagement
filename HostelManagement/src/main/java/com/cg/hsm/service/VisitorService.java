package com.cg.hsm.service;

import java.util.List;

import com.cg.hsm.entity.VisitorEntity;


public interface VisitorService {

	public long add(VisitorEntity entity);
	public void update(VisitorEntity entity);
	public void delete(VisitorEntity entity);
	public VisitorEntity findByName(String name);
	public VisitorEntity findByPk(long id);
	public List<VisitorEntity> search(VisitorEntity entity, long pageNo, int pageSize);
	public List<VisitorEntity> search(VisitorEntity entity);
	
	
}
