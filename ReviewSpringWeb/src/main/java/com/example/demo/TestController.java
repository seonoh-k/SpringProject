package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TestController {

	private final QuestionRepository qRepo;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "hello";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Question> qlist = this.qRepo.findAll();
		model.addAttribute("qlist", qlist);
		return "list";
	}
}
