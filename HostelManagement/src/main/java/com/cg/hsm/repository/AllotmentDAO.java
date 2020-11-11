package com.cg.hsm.repository;

import java.util.List;

import com.cg.hsm.entity.AllotmentEntity;


public interface AllotmentDAO {

	public long add(AllotmentEntity entity);
	public void update(AllotmentEntity entity);
	public void delete(AllotmentEntity entity);
	public AllotmentEntity findByName(String name);
	public AllotmentEntity findByPk(long id);
	public List<AllotmentEntity> search(AllotmentEntity entity, long pageNo, int pageSize);
	public List<AllotmentEntity> search(AllotmentEntity entity);
	
}
