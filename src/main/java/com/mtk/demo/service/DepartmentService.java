package com.mtk.demo.service;

import java.util.List;

import com.mtk.demo.dto.DepartmentDTO;

public interface DepartmentService {
	
	DepartmentDTO createDepartment(DepartmentDTO departmentDTO);
	
	DepartmentDTO getDepartmentById(Long departmentId);
	
	List<DepartmentDTO> getAllDepartmet();
	
	DepartmentDTO updateDepartment(Long departmentId, DepartmentDTO updatedDepartment);
	
	void deleteDepartment(Long departmentId);

}
