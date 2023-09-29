package com.employee.demo.Service;

import com.employee.demo.Model.Employee;
import com.employee.demo.Response.DepartmentResponse;
import com.employee.demo.Response.EmployeeResponse;
import com.employee.demo.Response.ResponseDto;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List <Employee> getAAllEmployees();
  //  public Optional<Employee> getEmployeeBasedOnId(Long id);
  public Employee saveUser(Employee employee);

    // ResponseDto getUser(Long userId);

    EmployeeResponse getEMployeeById(Long id);


  List<DepartmentResponse> getAllDepartmentsFromEmployee();
}
