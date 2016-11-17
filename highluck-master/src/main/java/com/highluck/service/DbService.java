package com.highluck.service;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highluck.dao.DbDAO;
import com.highluck.dao.AlarmDAO;
import com.highluck.dto.DbDTO;
import com.highluck.push.GCMVo;
import com.highluck.dto.DbValue;
import com.highluck.dto.Feed;
import com.highluck.dto.LikeUserDTO;
import com.highluck.dto.ReplyUserDTO;
import com.highluck.dto.UserValue;
import com.highluck.dto.AlarmDTO;

@Service
public class DbService {
	@Autowired
	private DbDAO dbDAO;
	@Autowired
	private AlarmDAO alarmDAO;
	
	public ArrayList<ReplyUserDTO> findAllByUserId(DbValue value){
		
		try {
			ArrayList<ReplyUserDTO> list = dbDAO.selectMainList(value);
		for(int i=0; i<list.size(); i++){
			AlarmDTO dto = new AlarmDTO();
			dto.setUser_id(list.get(i).feed_User_Id);
			dto.setContents(list.get(i).name+"님이 댓글을 남겼습니다. \n\n"+list.get(i).contents);
			dto.setType("1");
			dto.setType_id(value.getFeedId());
			alarmDAO.insert(dto);
		}
		
		return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<LikeUserDTO> findAllByUserId2(DbValue value){
		try {
			
			ArrayList<LikeUserDTO> list = dbDAO.selectMainList2(value);
			for(int i=0; i<list.size(); i++){
				AlarmDTO dto = new AlarmDTO();
				dto.setUser_id(list.get(i).feed_User_Id);
				dto.setContents(list.get(i).name+"님이 좋아요를 눌렀습니다.");
				dto.setType("1");
				dto.setType_id(value.getFeedId());
				alarmDAO.insert(dto);
			}
			
			return list;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<DbDTO> findAllByUserId3(DbValue value){
	
		try {
			
			ArrayList<DbDTO> list = dbDAO.selectMainList3(value);
			for(int i=0; i<list.size(); i++){
				AlarmDTO dto = new AlarmDTO();
				System.out.println(list.get(i). recive_User_Id);
				dto.setUser_id(list.get(i). recive_User_Id);
				dto.setContents(list.get(i).contents);
				dto.setType("2");
				dto.setType_id(list.get(i).id);
				alarmDAO.insert(dto);
			}
			
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<AlarmDTO> findAllByUserId4(DbValue value) throws Exception{
		return dbDAO.selectMainList4(value);
	}
	
	public ArrayList<AlarmDTO> findAllByUserId5(DbValue value) throws Exception{
		return dbDAO.selectMainList5(value);
	}



}
