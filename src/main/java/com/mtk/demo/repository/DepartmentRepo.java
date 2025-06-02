package com.mtk.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtk.demo.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
