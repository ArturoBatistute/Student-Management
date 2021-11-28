package com.master.studentManagement.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> getStudents(){
		
		return studentService.getStudents();
	}
}
