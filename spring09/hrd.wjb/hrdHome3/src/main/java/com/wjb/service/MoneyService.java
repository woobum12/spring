package com.wjb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjb.dto.MoneyDTO;
import com.wjb.repository.MoneyRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class MoneyService {
	
	@Autowired
	private MoneyRepository moneyRepository;
	
	public List<MoneyDTO> findAll2() {
		return moneyRepository.findAll();
	}

}
