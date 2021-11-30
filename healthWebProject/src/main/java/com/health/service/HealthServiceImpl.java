package com.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.dao.HealthDAOImpl;
import com.health.vo.HealthVO;

@Service("HealthServiceImpl")
public class HealthServiceImpl implements HealthService{

	@Autowired(required = false)
	private HealthDAOImpl dao;
	
	@Override
	public List<HealthVO> selectList() throws Exception {
		return dao.select();
	}
	
	
}
