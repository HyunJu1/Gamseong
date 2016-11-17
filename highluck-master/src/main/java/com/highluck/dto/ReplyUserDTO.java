package com.highluck.dto;

public class ReplyUserDTO {
	public String user_Id;
	public String name;
	public String contents;
	public long id;
	public long feed_Id;
	public String feed_User_Id;
	public String creation_Timestamp;
	
	
	
	public String getUser_id() {
		return user_Id;
	}
	public void setUser_id(String user_id) {
		this.user_Id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
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
