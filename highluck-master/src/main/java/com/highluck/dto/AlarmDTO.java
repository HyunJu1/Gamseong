package com.highluck.dto;

public class AlarmDTO {
	public long id;
	public String user_Id;
	public String contents;
	public String send_Timestamp;
	public String type;
	public long type_Id;

	
	
	

	

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getType_id() {
		return type_Id;
	}
	public void setType_id(long type_id) {
		this.type_Id = type_id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSend_timestamp() {
		return send_Timestamp;
	}
	public void setSend_timestamp(String send_timestamp) {
		this.send_Timestamp = send_timestamp;
	}
	
	public long getId() {
		return id;
	}
	public String getUser_id() {
		return user_Id;
	}
	public void setUser_id(String user_id) {
		this.user_Id = user_id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

}