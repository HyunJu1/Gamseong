package com.highluck.dto;

public class FeedDTO {
	
	public long id;
	public String location_Id;
	public String user_Id;
	public String contents;
	public String creation_Timestamp;
	public long like_Count;
	public long reply_Count;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocation_Id() {
		return location_Id;
	}
	public void setLocation_Id(String location_Id) {
		this.location_Id = location_Id;
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getCreation_Timestamp() {
		return creation_Timestamp;
	}
	public void setCreation_Timestamp(String creation_Timestamp) {
		this.creation_Timestamp = creation_Timestamp;
	}
	public long getLike_Count() {
		return like_Count;
	}
	public void setLike_Count(long like_Count) {
		this.like_Count = like_Count;
	}
	public long getReply_Count() {
		return reply_Count;
	}
	public void setReply_Count(long reply_Count) {
		this.reply_Count = reply_Count;
	}

}
