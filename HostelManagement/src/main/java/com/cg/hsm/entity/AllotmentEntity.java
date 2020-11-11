package com.cg.hsm.entity;

public class AllotmentEntity  {
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getHostelId() {
		return HostelId;
	}
	public void setHostelId(long hostelId) {
		HostelId = hostelId;
	}
	public String getHostelName() {
		return HostelName;
	}
	public void setHostelName(String hostelName) {
		HostelName = hostelName;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	private long id;
	private long HostelId;
	private String HostelName;
	private long userId;
	private String name;
	private long roomId;
	private String roomNo;

}
