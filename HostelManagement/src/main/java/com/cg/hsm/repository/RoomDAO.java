package com.cg.hsm.repository;

import java.util.List;

import com.cg.hsm.entity.RoomEntity;


public interface RoomDAO {

	public long add(RoomEntity entity);
	public void update(RoomEntity entity);
	public void delete(RoomEntity entity);
	public RoomEntity findByName(String name);
	public RoomEntity findByPk(long id);
	public List<RoomEntity> search(RoomEntity entity, long pageNo, int pageSize);
	public List<RoomEntity> search(RoomEntity entity);
	
	
}
