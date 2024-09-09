package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.chapter.used.Greet;

/**
 * 스프링 부트 기동 클래스
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
		.getBean(DemoApplication.class)
		.excute();
	}

	@Autowired
	Greet greet;
	
	private void excute() {
		greet.greeting();
	}

}
