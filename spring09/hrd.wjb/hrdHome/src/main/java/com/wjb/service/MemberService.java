package com.wjb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjb.dto.MemberDTO;
import com.wjb.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public void save(MemberDTO dto) {
		memberRepository.save(dto);
	}

	public List<MemberDTO> findAll() {
		return memberRepository.findAll();
	}

	public MemberDTO findById(Integer id) {
		return memberRepository.findById(id);
	}

	public void update(MemberDTO boardDTO) {
		memberRepository.update(boardDTO);
	}

	public void delete(Integer id) {
		memberRepository.delete(id);
	}
}