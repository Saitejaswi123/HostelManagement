package com.cg.hsm.repository;

import java.util.List;

import com.cg.hsm.entity.HostelEntity;


public interface HostelDAO {
	public long add(HostelEntity entity);
	public void update(HostelEntity entity);
	public void delete(HostelEntity entity);
	public HostelEntity findByName(String name);
	public HostelEntity findByPk(long id);
	public List<HostelEntity> search(HostelEntity entity, long pageNo, int pageSize);
	public List<HostelEntity> search(HostelEntity entity);
}
