package com.example.demo.Services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.util.beans.BeanInfoHelper.ReturningBeanInfoDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.Departments;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepo;

import jakarta.persistence.Entity;

@Service
public class EmployeeImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Employee AddEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@Override
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();	}
	
	@Override
	public void deleteAllRecords() {
		employeeRepo.deleteAll();
	}
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ResponseEntity<String> AllDepartments() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> Entity = new HttpEntity<String>("parameter", headers);
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8082/dep/Departments", HttpMethod.GET, Entity, String.class );
		return response;
	}
	
	@Override
	public ResponseEntity<Departments> createDepartmentFromEmployee(Departments departments) {
		return restTemplate.postForEntity("http://localhost:8082/dep/AddDepartments", departments, Departments.class);
	}
	
//	"http://localhost:8082/dep/update"
	@Override
	public void UpdateDepFromEmployee(Departments departments, Long id) {
		 restTemplate.put("http://localhost:8082/dep/update", departments);
	}

}
