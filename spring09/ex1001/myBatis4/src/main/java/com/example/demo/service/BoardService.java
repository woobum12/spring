package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	//DB사용하기 위한 준비
	private final BoardRepository boardRepository;
	
	public void save(BoardDTO dto) {
		boardRepository.save(dto);
	}
	
	public List<BoardDTO> findAll() {
		return boardRepository.findAll();
	}
	
	public BoardDTO findById(Long id) {
		return boardRepository.findByid(id);
	}
	
	public void update(BoardDTO boardDTO) {
		boardRepository.update(boardDTO);
	}
	
	public void delete (Long id) {
		boardRepository.delete(id);
	}
}
