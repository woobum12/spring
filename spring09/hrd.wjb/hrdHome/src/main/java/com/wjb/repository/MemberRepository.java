package com.wjb.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.wjb.dto.MemberDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
	
	private final SqlSessionTemplate sql;
	
	public MemberDTO save(MemberDTO dto) {
		sql.insert("Board.save", dto);
		return dto;
	}
	
	public List<MemberDTO> findAll() {
		return sql.selectList("Member.findAll");
	}
	
	public MemberDTO findById(Integer id) {
		return sql.selectOne("Member.findById", id);
	}
}
