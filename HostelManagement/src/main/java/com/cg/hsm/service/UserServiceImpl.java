package com.cg.hsm.service;

import java.util.List;

import com.cg.hsm.entity.UserEntity;

public class UserServiceImpl implements UserService {

	@Override
	public long add(UserEntity entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserEntity findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> search(UserEntity entity, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> search(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity authenticate(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changePassword(Long id, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long registerUser(UserEntity entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean forgetPassword(String login) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
