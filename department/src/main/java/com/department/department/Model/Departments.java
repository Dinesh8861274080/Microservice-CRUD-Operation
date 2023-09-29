package com.department.department.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "dept_location")
    private String deptLocation;

    @Column(name = "dept_address")
    private String deptAddress;


    public Departments(String deptName, String deptLocation, String deptAddress) {
        super();
        this.deptName = deptName;
        this.deptLocation = deptLocation;
        this.deptAddress = deptAddress;
    }


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptLocation() {
        return deptLocation;
    }

    public void setDeptLocation(String deptLocation) {
        this.deptLocation = deptLocation;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }
}
