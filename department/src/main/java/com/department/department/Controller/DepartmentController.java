package com.department.department.Controller;

import com.department.department.Model.Departments;
import com.department.department.Response.DepartmentResponse;
import com.department.department.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dep")
public class DepartmentController {

    @Autowired
    DepartmentService deptService;

    @GetMapping("/Departments")
    public List<Departments> getAllDepartments() {
        return deptService.getAllDepartments();
    }

    @GetMapping("/Departments/{id}")
   /* public Optional<Departments> getAllDepartmentsById(@PathVariable Long id) {
        return deptService.getDeptById(id);
    }*/
    public ResponseEntity<DepartmentResponse> getDepartmentById(@PathVariable("id") Long id) {
        DepartmentResponse departmentResponse = deptService.findDepartmentById(id);
        return ResponseEntity.status(HttpStatus.OK).body(departmentResponse);
    }

    @PostMapping("/AddDepartments")
    public Departments createDepartment(@RequestBody Departments departments) {
        return deptService.createDepartment(departments);
    }





}
