package com.example.demo;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewSpringWebApplicationTests {

	@Autowired
	private QuestionRepository qRepo;
	
	@Test
	void contextLoads() {
		
	Question q1 = new Question();
		
	q1.setSubject("족발보쌈 먹을 사람");
	q1.setContent("계산은 님이 하셈");
	q1.setCreateDate(LocalDateTime.now());
	this.qRepo.save(q1);
		
	Question q2 = new Question();
		
	q2.setSubject("아래 글 쓴놈 책임져라");
	q2.setContent("너 때문에 다이어트 깨짐");
	q2.setCreateDate(LocalDateTime.now());
	this.qRepo.save(q2);
		
	}

}
