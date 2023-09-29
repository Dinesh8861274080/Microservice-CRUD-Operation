package com.employee.demo.Controller;

import com.employee.demo.Model.Employee;
import com.employee.demo.Response.DepartmentResponse;
import com.employee.demo.Response.EmployeeResponse;
import com.employee.demo.Response.ResponseDto;
import com.employee.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/Employees")
    List<Employee> getAllEmployees(){
        return employeeService.getAAllEmployees();
    }
   @PostMapping("/add")
    public ResponseEntity<Employee> saveUser(@RequestBody Employee employee){
        Employee savedUser = employeeService.saveUser(employee);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

   /* @GetMapping("/Employees/{id}")
    Optional<Employee> getAllEmployees(@PathVariable Long id){
        return employeeService.getEmployeeBasedOnId(id);
    } */

    @GetMapping("/Departments")
    public List<DepartmentResponse> getDepartments(){
        return employeeService.getAllDepartmentsFromEmployee();

    }

    @GetMapping("/Employees/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable long id) {
        EmployeeResponse employeeResponse = employeeService.getEMployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
    }

}
