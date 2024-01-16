package com.shivam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

	public Employee findByEmail(String email);

}