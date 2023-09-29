package com.employee.demo.Response;


    import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public class ResponseDto {
        private DepartmentResponse department;
        private EmployeeResponse employee;

        public void setDepartment(DepartmentResponse departmentDto) {
        }
        public void setUser(EmployeeResponse employeeResponseo) {
        }
    }

