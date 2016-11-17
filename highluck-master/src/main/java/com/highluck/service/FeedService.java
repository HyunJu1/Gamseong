package com.highluck.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highluck.dao.FeedDAO;
import com.highluck.dto.Feed;
import com.highluck.dto.UserValue;

@Service
public class FeedService {
	@Autowired
	private FeedDAO feedDAO;
	
	public ArrayList<Feed> findAllByUserId(UserValue value){
		return feedDAO.findAllByUserId(value);
	}

}
