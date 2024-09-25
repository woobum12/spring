package com.example.quiz;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.quiz.entity.Quiz;
import com.example.quiz.repository.QuizRepository;

@SpringBootApplication
public class QuizApplication {
	/** 구동 메서드 */
	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args)
		.getBean(QuizApplication.class)
		.execute();
	}
	
	/** 주입 (인젝션) */
	@Autowired
	QuizRepository repository;
	
	/** 실행 메서드 */
	private void execute() {
		//등록 처리
		//setup();
		//전체 항목 취득
		//showList();
		showOne();
	}
	
	/** === 퀴즈 2건을 등록합니다 === */
	private void setup() {
		//엔티티 생성
		Quiz quiz1 = new Quiz(null, "Spring은 프레임워크입니까?",true,"홍길동");
		//등록 실행
		quiz1 = repository.save(quiz1);
		//등록 확인
		System.out.println("등록한 퀴즈는 "+ quiz1 + "입니다." );
		
		//엔티티 생성
		Quiz quiz2 = new Quiz(null, "스프링 MVC는 배치 처리를 제공합니까?",false, "홍길동");
		//등록실행
		quiz2 = repository.save(quiz2);
		//등록확인
		System.out.println("등록한 퀴즈는" + quiz2 + "입니다");
	}
	/** === 모든 데이터 취득 === */
	private void showList() {
		System.out.println("--- 모든 데이터 취득 개시 ---");
		//리포지토리를 이용해 모든 데이터를 취득해서 결과를 반환
		Iterable<Quiz> quizzes = repository.findAll();
		for (Quiz quiz : quizzes) {
			System.out.println(quiz);
		}
		System.out.println(" --- 모든 데이터 취득 완료 ---");
	}
private void showOne() {
	System.out.println("--- 1건 취득 개시 ---");
	// 리포지토리를 사용해서 1건의 데이터를 취득해서 겨로가를 반환(반환값은 Optional)
	Optional<Quiz> quizOpt = repository.findById(1);
	// 반환값이 있는지 확인
	if (quizOpt.isPresent()) {
		System.out.println(quizOpt.get());
	} else {
		System.out.println("해당 데이터는 존재하지 않습니다");
	}
	System.out.println("--- 1건 취득 완료 ---");
		
	}
	
}

