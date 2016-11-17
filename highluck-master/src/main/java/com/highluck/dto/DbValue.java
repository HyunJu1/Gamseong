package com.highluck.dto;

public class DbValue {

	private long feedId;
	private String reciveUserId;
	private String useId;
    private long id;



	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser_id() {
		return useId;
	}

	public void setUser_id(String user_id) {
		this.useId = user_id;
	}

	public String getRecive_user_id() {
		return reciveUserId;
	}

	public void setRecive_user_id(String recive_user_id) {
		this.reciveUserId = recive_user_id;
	}

	public long getFeedId() {
		return feedId;
	}

	public void setFeedId(long feedId) {
		this.feedId = feedId;
	}

}
