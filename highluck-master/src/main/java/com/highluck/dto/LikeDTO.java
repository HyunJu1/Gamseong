package com.highluck.dto;

public class LikeDTO {
	public long id;
	public long feed_Id;
	public String user_Id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFeed_Id() {
		return feed_Id;
	}
	public void setFeed_Id(long feed_Id) {
		this.feed_Id = feed_Id;
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String status;

}
