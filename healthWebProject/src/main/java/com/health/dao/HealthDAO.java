package com.health.dao;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import com.health.vo.HealthVO;

public interface HealthDAO{
	public List<HealthVO> select() throws Exception;
    public void insert(Member member);
    public void update(String name);
    public void delete(String name);
}
