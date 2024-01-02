package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.Entity.Departments;
import com.example.demo.Entity.Employee;

public interface EmployeeService {

	Employee AddEmployee(Employee employee);

	List<Employee> getEmployee();

	void deleteAllRecords();

	ResponseEntity<String> AllDepartments();


	ResponseEntity<Departments> createDepartmentFromEmployee(Departments departments);


	void UpdateDepFromEmployee(Departments departments, Long id);




}