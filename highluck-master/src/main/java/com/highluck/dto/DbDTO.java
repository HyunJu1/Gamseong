package com.highluck.dto;

public class DbDTO {
	
	public int id;
	public String user_Id;
	public String name;
	public String  recive_User_Id;
	public String contents;
	public String  status;
	public String creation_Timestamp;
	public int feed_Id;

	public String getCreation_timestamp() {
		return creation_Timestamp;
	}
	public int getFeed_id() {
		return feed_Id;
	}
	public void setFeed_id(int feed_id) {
		this.feed_Id = feed_id;
	}
	public void setCreation_timestamp(String creation_timestamp) {
		this.creation_Timestamp = creation_timestamp;
	}
	public String getRecive_user_id() {
		return recive_User_Id;
	}
	public void setRecive_user_id(String recive_user_id) {
		this.recive_User_Id = recive_user_id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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

}
