package com.department.department.Repository;

import com.department.department.Model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Departments, Long> {


}
