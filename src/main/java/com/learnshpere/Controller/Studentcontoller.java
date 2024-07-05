package com.learnshpere.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnshpere.Entity.Student;
import com.learnshpere.Service.Studentservice;

@Controller
public class Studentcontoller {
	@Autowired
	Studentservice ss;

	@PostMapping("/addStudent")
	public String addstudent(@RequestParam("sid") int sid, @RequestParam("sname") String sname,
			@RequestParam("sbranch") String sbranch) {
		Student s = new Student();
		s.setSid(sid);
		s.setSname(sname);
		s.setBranch(sbranch);
		ss.addstudent(s);

		return "redirect:/";
	}

}
