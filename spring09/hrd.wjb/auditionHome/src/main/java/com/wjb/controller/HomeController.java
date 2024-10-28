package com.wjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wjb.dto.ArtistDTO;
import com.wjb.service.ArtistService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {
		
	private final ArtistService artistService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(ArtistDTO artistDTO) {
		artistService.insertOne(artistDTO);
		return "redirect:/";
	}
	
	@GetMapping("/basic")
	public String listBasic(Model model) {
		model.addAttribute("artistList", artistService.selectAll_basic());
		return "index";
	}
	
	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("artistList", artistService.selectAll());
		return "index";
	}
	
	@GetMapping("/{artist_id}")
	public String findById(@PathVariable("artist_id") String artist_id, Model model) {
		System.out.println("=============>>" + artist_id);
		model.addAttribute("artist", artistService.selectOne(artist_id));
		return "detail";
	}
	
	@GetMapping("/update/{artist_id}")
	public String update(@PathVariable("artist_id") String artist_id, Model model) {
		/*
		 * System.out.println("=============>>update:" + artist_id); 
		 * String s = artist_id.replace('"', ' ').trim();
		 * System.out.println("=============>>update_s:수정후" + s);
		 * System.out.println("=============>>update:수정후" + artist_id);
		 */
		// 타입리프에서 붙인 "를 제거하는 부분.
	}
}
