package com.employee.demo.Response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private DepartmentResponse departmentResponse;

    public void setId(long id) {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public DepartmentResponse getDepartmentResponse() {
        return departmentResponse;
    }

    public void setDepartmentResponse(DepartmentResponse departmentResponse) {
        this.departmentResponse = departmentResponse;
    }
}
