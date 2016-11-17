package com.highluck.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.highluck.dto.Feed;
import com.highluck.dto.UserValue;



@Repository
public class FeedDAO extends AbstractDAO{
	
	@SuppressWarnings("unchecked")
	public ArrayList<Feed> findAllByUserId(UserValue value){
		return (ArrayList<Feed>)
				selectList("feedDAO.finalAllByUserId",value);
		
	}

}
