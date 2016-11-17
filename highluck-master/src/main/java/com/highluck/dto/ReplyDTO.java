package com.highluck.dto;

public class ReplyDTO {
	public long id;
	public long feed_Id;
	public String contents;
	public String creation_Timestamp;
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
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getStatus_Code() {
		return status_Code;
	}
	public void setStatus_Code(String status_Code) {
		this.status_Code = status_Code;
	}
	public String user_Id;
	public String status_Code;
	

}
