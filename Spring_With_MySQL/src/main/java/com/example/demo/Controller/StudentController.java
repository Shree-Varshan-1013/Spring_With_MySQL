package com.example.demo.Controller;

import java.util.List;
import com.example.demo.Student.Student;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.Service.StudentDAO;


@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentDAO servRepo;
	
	@GetMapping("/get")
	public List<Student> Get() {
		return servRepo.getStudents();
	}
	
	@PostMapping("/add")
	public Student Save(@RequestBody Student stud) {
		return servRepo.addStudent(stud);
	}
	
	@GetMapping("/delete/{id}")
	public void GetId(@PathVariable("id") String id) {
		servRepo.delStudent(id);		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> GetById(@PathVariable("id") String id) {
		Student stud = servRepo.getById(id);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Type", "Get Student by id");
		return new ResponseEntity<Student>(stud, headers, HttpStatus.OK);
	}
	
}
