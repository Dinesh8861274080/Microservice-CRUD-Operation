package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departments {
 
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
    


    public Departments() {
		super();
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

