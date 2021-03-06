package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/studentForm")
	public String studentForm() {
	
		return "createPage";
	}
	@RequestMapping("/student/create")
	public String create(@ModelAttribute("student") Student student, BindingResult result) {
		String page = "createDonPage";
		
		StudentValidator validator = new StudentValidator();
		validator.validate(student,  result);
		if(result.hasErrors()) {
			page = "createPage";
		}
	
		return "createDonPage";
	}
	
		
}
