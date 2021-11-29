package com.master.studentManagement.student;

import java.awt.IllegalComponentStateException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudents(){
		
		return studentRepository.findAll();
	}
	
	public Student saveStudent(Student newStudent){
		
		final Optional<Student> existentStudentByEmail = studentRepository.findStudentByEmail(newStudent.getEmail());
		
		if(existentStudentByEmail.isPresent()) {
			
			throw new IllegalComponentStateException("Email already in usage.");
		} 
		else
		{
			return studentRepository.save(newStudent);
		}
	}
}
