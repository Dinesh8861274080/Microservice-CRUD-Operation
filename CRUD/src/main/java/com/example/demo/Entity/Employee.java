package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee")
public class Employee {


	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name = "phone")
    private Integer phone;

	public Employee(Long id, String name, String address, Integer phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	public Employee(Long id, String name, String address, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Employee() {
		super();
	}

}
