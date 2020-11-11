package com.cg.hsm.service;

import java.util.List;

import com.cg.hsm.entity.WardenEntity;


public interface WardenService {

	public long add(WardenEntity entity);
	public void update(WardenEntity entity);
	public void delete(WardenEntity entity);
	public WardenEntity findByName(String name);
	public WardenEntity findByPk(long id);
	public List<WardenEntity> search(WardenEntity entity, long pageNo, int pageSize);
	public List<WardenEntity> search(WardenEntity entity);
	
	
}
