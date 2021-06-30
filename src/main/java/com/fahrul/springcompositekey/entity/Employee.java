package com.fahrul.springcompositekey.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMPLOYEE_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
/* @IdClass(EmployeePKId.class) */
public class Employee {
	@EmbeddedId
	private EmployeePKId employeePKId;
	private String name;
	private String email;
	private String phone;

}
