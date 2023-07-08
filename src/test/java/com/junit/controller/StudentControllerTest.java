/*package com.junit.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.junit.Entity.Student;
import com.junit.service.StudentService;

public class StudentControllerTest {
	@Mock
	private StudentService studentService;

	@InjectMocks
	private StudentController studentController;

	@Test
	public void testGetAllStudents() {
		// Mock data
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "John", 22, "john@gmail.com", 1, new Date()));
		students.add(new Student(2, "Jane", 23, "jane@gmail.com", 2, new Date()));

		// Mocking the StudentService's getAllStudents() method
		when(studentService.getAllStudents()).thenReturn(students);

		// Call the API
		ResponseEntity<List<Student>> response = studentController.getAllStudents();

		// Verify the response
		verify(studentService, times(1)).getAllStudents();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(students.size(), response.getBody().size());
		assertEquals(students.get(0), response.getBody().get(0));
		assertEquals(students.get(1), response.getBody().get(1));
	}

	@Test
	public void testGetAllStudentsEmptyList() {
		// Mock data
		List<Student> students = new ArrayList<>();

		// Mocking the StudentService's getAllStudents() method
		when(studentService.getAllStudents()).thenReturn(students);

		// Call the API
		ResponseEntity<List<Student>> response = studentController.getAllStudents();

		// Verify the response
		verify(studentService, times(1)).getAllStudents();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(students.size(), response.getBody().size());
	}
}*/
