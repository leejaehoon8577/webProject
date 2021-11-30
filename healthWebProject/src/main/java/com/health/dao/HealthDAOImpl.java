package com.health.dao;

import java.lang.reflect.Member;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.health.vo.HealthVO;

@Repository("HealthDAOImpl")
public class HealthDAOImpl implements HealthDAO{

	private static final String NAMESPACE = "com.health.dao.Mybatis";
	
	@Autowired
	private SqlSession sqlsession;
	

	@Override
	public List<HealthVO> select() {
		return sqlsession.selectList(NAMESPACE + ".select");
	}

	@Override
	public void insert(Member member) {
		
	}

	@Override
	public void update(String name) {
		
	}

	@Override
	public void delete(String name) {
		
	}
}
