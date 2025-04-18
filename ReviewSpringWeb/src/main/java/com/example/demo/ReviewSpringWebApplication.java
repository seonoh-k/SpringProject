package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReviewSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewSpringWebApplication.class, args);
	}

}

// JPA와 ORM
// ORM Object Relational Mapping : SQL 없이 데이터 베이스의 관리르 돕는 도구
// -> ORM을 자바 기반 환경에서 활요하는 경우를 JPA라고 할 수 있다
// -> 스프링부트는 JPA를 ORM 기술의 표준으로 채택
// -> 스프링부트에서는 JPA를 실질적으로 미리 구현을 준비
//		JPA를 실질적으로 구현하는 클래스(인터페이스)를 하이버네이트라고 부른다 [하이버네이트 = 자바의 ORM 프레임워크 중 하나]

// JPA에서 사용하는 메소드

// thymeleaf에서 자주 사용되거나 유용한 속성들
// text, utext -> utext의 경우 html 자페를 그대로 렌더링하는 특성이 있음

// if
// switch/case -> if 보다 속도는 빠르지만 조건문 지정의 한계로 if문을 사용하는 경우가 많음
// 삼항연산자
// ex) th:text="${list.length >= 10 ? 'ok' : 'no'}"

// attr 동적 속성 설정 (여러 속성을 동시에 설정할때 사용) -> 타임리프 속성
// ex) th:attr ="href=@{}, text=${}"

// classappend : 조건부로 CSS 클래스를 추가시 사용

// each : 반복문 대체 -> loop라는 객체를 통해 반복문을 좀 더 다양하게 표현할 수 있음
// ex) th:each="qlist : ${qlist}"
// loop.index : 순서, 0부터 1씩 증가 /.count : 순서, 1부터 1씩 증가 /.size : 반복할 객체의 요소 개수 
// .first : 첫번째일 경우 true /.last : 마지막일 경우 true 
// .odd : 홀수번째 순일 경우 true /.even : 짝수번째 순일 경우 true /.current : 현재 데입된 객체

// 스프링 시큐리티 -> 스프링에서 인증, 인가, 권한을 담당하는 프레임워크
// 인증 : 사용자 확인 프로세스
// 인가 : 권한