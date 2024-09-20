package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Member;

@Controller
@RequestMapping("hello")
public class HelloModelController {
	
	@GetMapping("model")
	public String helloView(Model model) {
		
		Member member = new Member(1, "회원01");
		
		Member member1 = new Member(10, "홍길동");
		Member member2 = new Member(20, "이영희");
		
		//List 생성
		List<String> directionList = new ArrayList<String>();
		directionList.add("동");
		directionList.add("서");
		directionList.add("남");
		directionList.add("북");
		
		//map을 생성해서 Member를 저장
		Map<String, Member> memberMap = new HashMap<>();
		memberMap.put("hong", member1);
		memberMap.put("lee", member2);
		
		//List를 생성해서 Member을 저장
		List<Member> memberList = new ArrayList<>();
		memberList.add(member1);
		memberList.add(member2);

		//Model에 데이터를 저장
		model.addAttribute("msg", "타임리프!!!");
		model.addAttribute("name", "종범");
		model.addAttribute("mb", member);
		model.addAttribute("list", directionList);
		model.addAttribute("map", memberMap);
		model.addAttribute("members", memberList);
		
		//반환값으로 뷰 이름을 돌려줌
		return "helloThymeleaf";
	}
	@GetMapping("a")
	public String showA() {
		return "pageA";
	}
}
