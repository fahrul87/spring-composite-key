package com.fahrul.springcompositekey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.springcompositekey.entity.Employee;
import com.fahrul.springcompositekey.entity.EmployeePKId;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeePKId> {

}
