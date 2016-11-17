package com.highluck.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.highluck.common.AbstractDAO;
import com.highluck.dao.DbDAO;
import com.highluck.dto.AlarmDTO;
import com.highluck.dto.DbDTO;
import com.highluck.dto.DbValue;
import com.highluck.dto.LikeUserDTO;
import com.highluck.dto.ReplyUserDTO;
import com.highluck.dto.UserValue;

@Repository
public class DbDAO extends AbstractDAO{
	
	@SuppressWarnings("unchecked")
	public ArrayList<ReplyUserDTO> selectMainList(DbValue value) throws Exception{
        return (ArrayList<ReplyUserDTO>)selectList("List1.selectList1", value);
    }
	@SuppressWarnings("unchecked")
	public ArrayList<LikeUserDTO> selectMainList2(DbValue value) throws Exception{
        return (ArrayList<LikeUserDTO>)selectList("List2.selectList2", value);
    }
	@SuppressWarnings("unchecked")
	public ArrayList<DbDTO> selectMainList3(DbValue value) throws Exception{
        return (ArrayList<DbDTO>)selectList("List3.selectList3", value);
    }
	@SuppressWarnings("unchecked")
	public ArrayList<AlarmDTO> selectMainList4(DbValue value) throws Exception{
        return (ArrayList<AlarmDTO>)selectList("List4.selectList4", value);
   
	}
	@SuppressWarnings("unchecked")
	public ArrayList<AlarmDTO> selectMainList5(DbValue value) throws Exception{
        return (ArrayList<AlarmDTO>)selectList("alarm1.update", value);
   
	}
}

