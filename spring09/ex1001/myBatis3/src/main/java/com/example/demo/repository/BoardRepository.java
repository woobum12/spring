package com.example.demo.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.BoardDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
	
	private final SqlSessionTemplate sql;
	
	/*
	 * "Board.save" <mapper namespace="Board"> 참고 <insert id="save" 참고>
	 */
	
	/*
	 * parameter Type="board" <typeAlias type="com.example.demo.dto.BoardDTO"
	 * alias="board"> 참고
	 */
	public BoardDTO save(BoardDTO dto) {
		sql.insert("Board.save", dto);
		return dto;
	}
	
	public List<BoardDTO> findAll() {
		return sql.selectList("Board.findAll");
	}
}
