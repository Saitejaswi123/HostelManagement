package com.cg.hsm.service;

import java.util.List;

import com.cg.hsm.entity.FeeEntity;


public interface FeeService {

	public long add(FeeEntity entity);
	public void update(FeeEntity entity);
	public void delete(FeeEntity entity);
	public FeeEntity findByName(String name);
	public FeeEntity findByPk(long id);
	public List<FeeEntity> search(FeeEntity entity, long pageNo, int pageSize);
	public List<FeeEntity> search(FeeEntity entity);
}
