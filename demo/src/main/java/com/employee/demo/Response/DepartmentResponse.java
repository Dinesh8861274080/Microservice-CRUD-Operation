package com.employee.demo.Response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentResponse {

    private long id;
    private String deptName;
    private String deptAddress;

    public String getDeptLocation() {
        return deptLocation;
    }

    public void setDeptLocation(String deptLocation) {
        this.deptLocation = deptLocation;
    }

    private String deptLocation;


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }
}

