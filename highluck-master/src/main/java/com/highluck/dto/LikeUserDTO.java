package com.highluck.dto;

public class LikeUserDTO {
   public long user_Id;
	public String name;
	public long id;
	public long feed_Id;
	public String feed_User_Id;
	
	public long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}
	public long getFeed_Id() {
		return feed_Id;
	}
	public void setFeed_Id(long feed_Id) {
		this.feed_Id = feed_Id;
	}
	public String getFeed_user_id() {
		return feed_User_Id;
	}
	public void setFeed_user_id(String feed_user_id) {
		this.feed_User_Id = feed_user_id;
	}
	public long getUser_id() {
		return user_Id;
	}
	public void setUser_id(long user_id) {
		this.user_Id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFeed_id() {
		return feed_Id;
	}
	public void setFeed_id(long feed_id) {
		this.feed_Id = feed_id;
	}
	

}
