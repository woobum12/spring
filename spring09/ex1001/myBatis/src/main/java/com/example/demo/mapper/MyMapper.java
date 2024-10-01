package com.example.demo.mapper;

import java.lang.reflect.Member;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface MyMapper {
	List<Member> selectMember();
}
