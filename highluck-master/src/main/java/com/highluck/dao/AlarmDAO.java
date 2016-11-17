package com.highluck.dao;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.highluck.common.AbstractDAO;
import com.highluck.dto.DbValue;
import com.highluck.dto.AlarmDTO;
import com.highluck.dto.DbDTO;
@Repository
public class AlarmDAO extends AbstractDAO {
	
	public void insert(AlarmDTO value) throws Exception{
        insert("alarm.insert", value);
    }
}