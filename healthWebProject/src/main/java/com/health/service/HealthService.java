package com.health.service;

import java.util.List;

import com.health.vo.HealthVO;

public interface HealthService {
	
	public List<HealthVO> selectList() throws Exception;
}
