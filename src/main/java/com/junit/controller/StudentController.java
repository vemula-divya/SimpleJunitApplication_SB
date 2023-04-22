package com.junit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.Entity.Student;
import com.junit.service.StudentService;

@RestController
@RequestMapping("/student")
@Configuration
@ComponentScan(basePackages = { "com.junit" })
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> listOfStudents = new ArrayList<>();
		listOfStudents.addAll(service.getAllStudents());
		for (int i = 0; i < listOfStudents.size(); i++) {
			System.out.println(listOfStudents.get(i));
		}
		return new ResponseEntity<>(listOfStudents, HttpStatus.OK);
	}

}
