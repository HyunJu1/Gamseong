package com.highluck.dao;

import com.highluck.common.AbstractDAO;
import com.highluck.dto.AlarmDTO;

public class StatusDAO extends AbstractDAO {
	
	public void update(AlarmDTO value) throws Exception{
        update("alarm1.update", value);
    }
}