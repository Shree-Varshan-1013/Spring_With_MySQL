package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.Student.Student;


@SpringBootTest
class MySqlDbApplicationTests {
	
//	@Autowired
//	private EmployeeDAO employeeDao;
//
//	@Test
//	void addEmployeeTest() {
//		Employee emp = new Employee();
//		emp.setName("shree");
//		emp.setBranch("SBI");
//		emp.setLocation("TNJ");
//		employeeDao.save(emp);
//	}
	
//	@Test
	void addStudent() {
		Student ob = new Student();
		ob.setRollNo("727721eucs140");
		ob.setName("SHREE");
		ob.setAge(19);
//		ob.setDob(2003-11-13);
		
	}

}
