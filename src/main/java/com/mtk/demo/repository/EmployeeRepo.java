package com.mtk.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtk.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
