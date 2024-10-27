package com.wjb.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wjb.dto.MoneyDTO;

@Repository
public class MoneyRepository {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	public List<MoneyDTO> findAll() {
		return sql.selectList("Money.findAll");
	}
}
