/*package com.junit.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.junit.Entity.Student;
import com.junit.repo.StudentRepo;
import com.junit.serviceimpl.StudentServiceImpl;
public class StudentServiceImplTest {
	@Mock
	private StudentRepo studentRepo; // Mock object for StudentRepo

	@InjectMocks
	private StudentServiceImpl studentService; // Object of StudentServiceImpl with mocked dependencies

	@Test
	public void testGetAllStudents_Success() {
		// Mocking the behavior of studentRepo.findAll() to return a list of students
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "John", 22, "john@gmail.com", 1, new Date()));
		students.add(new Student(2, "Jane", 23, "jane@gmail.com", 2, new Date()));
		when(studentRepo.findAll()).thenReturn(students);

		List<Student> result = studentService.getAllStudents();

		// Assertions
		assertNotNull(result);
		assertEquals(2, result.size());
		assertEquals("John", result.get(0).getName());
		assertEquals("Jane", result.get(1).getName());
		
		verify(studentRepo, times(1)).findAll(); // Verify that studentRepo.findAll() is called exactly once
	}

	@Test
	public void testGetAllStudents_Exception() {
		// Mocking the behavior of studentRepo.findAll() to throw an exception
		when(studentRepo.findAll()).thenThrow(new RuntimeException("Error occurred while fetching students"));
		List<Student> result = studentService.getAllStudents();
		// Assertions
		assertNotNull(result);
		assertEquals(0, result.size());

		// Verify that studentRepo.findAll() is called exactly once
		verify(studentRepo, times(1)).findAll();
	}
}
*/
