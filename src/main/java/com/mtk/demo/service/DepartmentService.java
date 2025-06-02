package com.mtk.demo.service;

import com.mtk.demo.dto.DepartmentDTO;

public interface DepartmentService {
	
	DepartmentDTO creatEmployee(DepartmentDTO departmentDTO);
	
	DepartmentDTO getAllEmployee(Long departmentId);
	
	DepartmentDTO updateEmployee(Long departmentId, DepartmentDTO updatedDepartment);
	
	void deleteEmployee(Long departmentId);

}
