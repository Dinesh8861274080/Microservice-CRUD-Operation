package com.employee.demo.Service;


import com.employee.demo.Model.Employee;
import com.employee.demo.Repository.EmployeeRepository;
import com.employee.demo.Response.DepartmentResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.employee.demo.Response.EmployeeResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private ModelMapper mapper;
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public List<Employee> getAAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee saveUser(Employee employee) {
        return employeeRepo.save(employee);
    }



   /* @Override
    public Optional<Employee> getEmployeeBasedOnId(Long id) {
        return employeeRepo.findById(id);
    } */

   /* @Override
    public ResponseDto getUser(Long userId) {

        ResponseDto responseDto = new ResponseDto();
        Employee employee = employeeRepo.findById(userId).get();
        EmployeeResponse employeeResponse = mapToUser(employee);

        ResponseEntity<DepartmentResponse> responseEntity = restTemplate
                .getForEntity("http://localhost:8082/dep/Departments/" + employee.getId(),
                        DepartmentResponse.class);

        DepartmentResponse departmentDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        responseDto.setUser(employeeResponse);
        responseDto.setDepartment(departmentDto);

        return responseDto;
    }

    private EmployeeResponse mapToUser(Employee user){
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(user.getId());
        employeeResponse.setFirstName(user.getFirstName());
        employeeResponse.setLastName(user.getLastName());
        employeeResponse.setEmailId(user.getEmailId());
        return employeeResponse;
    }*/
     // To get all department data in to the one table
    @Override
    public EmployeeResponse getEMployeeById(Long id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        DepartmentResponse departmentResponse = restTemplate.getForObject("http://localhost:8082/dep/Departments/{id}", DepartmentResponse.class, id);
        employeeResponse.setDepartmentResponse(departmentResponse);
        return employeeResponse;
    }



    // To get All Departments data in the employee URL
    @Override
    public List<DepartmentResponse> getAllDepartmentsFromEmployee() {

        ObjectMapper mapper=new ObjectMapper();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        String body = restTemplate.exchange("http://localhost:8082/dep/Departments", HttpMethod.GET, entity, String.class).getBody();
        List<DepartmentResponse> departmentResponses = null;
        try {
            departmentResponses = mapper.readValue(body, new TypeReference<List<DepartmentResponse>>() {
            });
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return departmentResponses;
    }




}
