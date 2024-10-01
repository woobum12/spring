package com.example.demo.service;

import java.lang.reflect.Member;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MyMapper;

@Service
public class MyService {
	@Autowired
	private MyMapper myMapper;
	
	public List<Member> selectMember() {
		return myMapper.selectMember();
	}
}
