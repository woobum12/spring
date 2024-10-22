package com.wjb.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.wjb.dto.MemberDTO;
import com.wjb.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberRepository memberRepository;
	
	public void save(MemberDTO dto) {
		memberRepository.save(dto);
	}
	public List<MemberDTO> findAll() {
		return memberRepository.findAll();
	}
	
	public MemberDTO findById(Integer id) {
		return memberRepository.findById(id);
	}
}
