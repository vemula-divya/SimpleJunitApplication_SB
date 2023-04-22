package com.junit.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.Entity.Student;
import com.junit.repo.StudentRepo;
import com.junit.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> getAllStudents(){
		
		try {
			return studentRepo.findAll();
		} catch (Exception ex) {	
			System.err.println("Error occurred while fetching all students: " + ex.getMessage());
			return new ArrayList<>();
		}
	
	}
	
	

}
