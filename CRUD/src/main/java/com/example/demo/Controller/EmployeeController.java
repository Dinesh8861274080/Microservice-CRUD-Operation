package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Departments;
import com.example.demo.Entity.Employee;
import com.example.demo.Services.EmployeeService;

@RestController
@RequestMapping("/empl")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee AddE( @RequestBody Employee employee) {
		return employeeService.AddEmployee(employee);
	}
	@GetMapping("get")
	public List<Employee> getAllEmployees() {
		return employeeService.getEmployee();
		}
	
	@DeleteMapping("deleteAll")
	public String deleteAllRecordsInDB() {
		employeeService.deleteAllRecords();
		return "deleeted Successfully";
	}
	
	@GetMapping("/Departments")
	public ResponseEntity<String> GetDepartments() {
		return employeeService.AllDepartments();
	}
	@PostMapping("/AddDepartment")
	public ResponseEntity<Departments> CreateDepartment(@RequestBody Departments departments) {
		return employeeService.createDepartmentFromEmployee(departments);
	}
	
	@PutMapping("/update")
	public void updatedep(@RequestBody Departments departments, @PathVariable Long id) {
		employeeService.UpdateDepFromEmployee(departments, id);
	}

}
