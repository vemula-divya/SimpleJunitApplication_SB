package com.junit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junit.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	

}
