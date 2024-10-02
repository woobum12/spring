package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;

import lombok.RequiredArgsConstructor;

/*
 *  @RequiredArgsConstructor
 *  final이 붙은 필드만, 생성자를 만들어준다
 */
@Controller
@RequiredArgsConstructor
public class BoardController {

	//생성자 주입방식
	// Model 사용하기 위한 준비
	private final BoardService boardService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(BoardDTO dto) {
		System.out.println("DTO = " + dto);
		boardService.save(dto);
		// return "index";
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String findAll(Model model) {
		List<BoardDTO> boardDTOList = boardService.findAll();
		model.addAttribute("boardList", boardDTOList);
		System.out.println("boardDTOList = " + boardDTOList);
		return "list";
	}
	
	@GetMapping("/{id}")
	public String findById (@PathVariable("id") Long id, Model model) {
		//상세내용 가져옴
		BoardDTO boardDTO = boardService.findById(id);
		model.addAttribute("board",boardDTO);
		System.out.println("boardDTO = " + boardDTO);
		return "detail";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") Long id, Model model) {
		BoardDTO boardDTO = boardService.findById(id);
		model.addAttribute("board", boardDTO);
		return "update";
	}
	
	@PostMapping("/update/{id}")
	public String update(BoardDTO boardDTO, Model model) {
		boardService.update(boardDTO);
		BoardDTO dto = boardService.findById(boardDTO.getId());
		model.addAttribute("board", dto);
		return "detail";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		boardService.delete(id);
		return "redirect:/list";
	}
}
