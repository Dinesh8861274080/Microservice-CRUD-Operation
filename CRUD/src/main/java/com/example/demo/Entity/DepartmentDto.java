package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "Departments1")
public class DepartmentDto {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @Column(name = "dept_name")
	    private String deptName;

	    @Column(name = "dept_location")
	    private String deptLocation;

	    @Column(name = "dept_address")
	    private String deptAddress;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
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

		public DepartmentDto(long id, String deptName, String deptLocation, String deptAddress) {
			super();
			this.id = id;
			this.deptName = deptName;
			this.deptLocation = deptLocation;
			this.deptAddress = deptAddress;
		}

		@Override
		public String toString() {
			return "DepartmentDto [id=" + id + ", deptName=" + deptName + ", deptLocation=" + deptLocation
					+ ", deptAddress=" + deptAddress + "]";
		}

		public DepartmentDto() {
			super();
		}





}
