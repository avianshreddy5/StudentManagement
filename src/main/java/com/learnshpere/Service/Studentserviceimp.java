package com.learnshpere.Service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.learnshpere.Entity.Student;

import com.learnshpere.Repository.Studentrepo;

@Service
public class Studentserviceimp implements Studentservice {
	@Autowired
	Studentrepo srepo;
	@Override
	public String addstudent(Student std) {
		srepo.save(std);
		return "student added";
	}

}
