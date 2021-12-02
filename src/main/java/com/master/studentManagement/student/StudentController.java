package com.master.studentManagement.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Student Management")
@RestController
@RequestMapping("api/v1/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@ApiOperation(value = "Get all Students")
	@GetMapping
	public List<Student> getStudents(){
		
		return studentService.getStudents();
	}
	
	@ApiOperation(value = "Create a new student")
	@PostMapping
	public Student saveStudent(@RequestBody Student student){
		
		return studentService.saveStudent(student);
	}
}
