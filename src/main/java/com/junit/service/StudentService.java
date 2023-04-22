package com.junit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.Entity.Student;
import com.junit.repo.StudentRepo;

@Service
public interface StudentService {
	
	public List<Student> getAllStudents();
	

}
