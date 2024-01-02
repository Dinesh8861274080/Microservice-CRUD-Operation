package com.department.department.Service;

import com.department.department.Model.Departments;
import com.department.department.Repository.DepartmentRepository;
import com.department.department.Response.DepartmentResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentSServiceImpl implements DepartmentService{
    @Autowired
     DepartmentRepository deptRepo;
    @Autowired(required = true)
    ModelMapper mapper;
    @Override
    public List<Departments> getAllDepartments() {
        return deptRepo.findAll();
    }

    @Override
    public Optional<Departments> getDeptById(Long id) {
        return deptRepo.findById(id);
    }

    @Override
    public Departments createDepartment(Departments departments) {
        return deptRepo.save(departments);
    }
    @Override
    public DepartmentResponse findDepartmentById(Long id) {
        Optional<Departments> department = deptRepo.findById(id);
        DepartmentResponse departmentResponse = mapper.map(department, DepartmentResponse.class);
        return departmentResponse;
    }
    
    @Override
    public Departments update(Departments departmentResponse) {
    	Departments departmentResponse2 = new Departments();
    	departmentResponse2.setDeptAddress(departmentResponse.getDeptAddress());
    	departmentResponse2.setDeptLocation(departmentResponse.getDeptLocation());
    	departmentResponse2.setDeptName(departmentResponse.getDeptName());
    	departmentResponse2.setId(departmentResponse.getId());
    	return deptRepo.save(departmentResponse2);
    }


}
