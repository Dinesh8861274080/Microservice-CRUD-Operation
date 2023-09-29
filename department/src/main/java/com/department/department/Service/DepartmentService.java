package com.department.department.Service;

import com.department.department.Model.Departments;
import com.department.department.Response.DepartmentResponse;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public List<Departments> getAllDepartments();
    public Optional<Departments> getDeptById(Long id);
    public Departments createDepartment(Departments departments);

    DepartmentResponse findDepartmentById(Long id);
}
