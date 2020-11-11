package com.cg.hsm.service;

import java.util.List;

import com.cg.hsm.entity.RoleEntity;


public interface HostelService {
	public long add(RoleEntity entity);
	public void update(RoleEntity entity);
	public void delete(RoleEntity entity);
	public RoleEntity findByName(String name);
	public RoleEntity findByPk(long id);
	public List<RoleEntity> search(RoleEntity entity, long pageNo, int pageSize);
	public List<RoleEntity> search(RoleEntity entity);
}
