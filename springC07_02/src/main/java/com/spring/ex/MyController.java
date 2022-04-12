package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ex.data.KyungminUniversityStudent;

@Controller
public class MyController {
	@RequestMapping("student/{name}")
	public String stuInfo(@PathVariable String name, Model m) {
		m.addAttribute("name", name);
		return "member/stuInfo";
	}

	@RequestMapping("student/mv")
	public ModelAndView third() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("major", "융소");	//모델에 실림.
		mv.setViewName("member/major");
		
		return mv;
	}
	
	@RequestMapping("stu")
	public String stu() {
		
		
		return "stu";
	}
	
	@RequestMapping("stuOk")
	public String stuOk(@ModelAttribute("kus") KyungminUniversityStudent kyungminUniversityStudent) {
		
		return "stuOk";
	}
}
