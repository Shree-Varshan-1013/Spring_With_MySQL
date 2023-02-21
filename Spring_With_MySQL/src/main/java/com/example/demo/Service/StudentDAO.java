package com.example.demo.Service;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Student.Student;

@Service
public class StudentDAO {

	@Autowired
	private StudentRepository repo;

	public Student addStudent(Student stud) {
		return repo.save(stud);
	}

	public void delStudent(String id) {
		repo.deleteById(id);
	}

	public List<Student> getStudents() {
		List<Student> arr = new ArrayList<Student>();
		Streamable.of(repo.findAll()).forEach(stud -> {
			arr.add(stud);
		});
		;
		return arr;
	}

	public Student getById(String id) {
		Student stud = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("the requested id " + id + " is not found !"));
		return stud;
	}

}
