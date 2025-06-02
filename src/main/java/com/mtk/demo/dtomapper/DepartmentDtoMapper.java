package com.mtk.demo.dtomapper;

import com.mtk.demo.dto.DepartmentDTO;
import com.mtk.demo.entity.Department;

public class DepartmentDtoMapper {
	
	public static DepartmentDTO mapToDepartmentDTO(Department department) {
		return new DepartmentDTO(
				department.getId(),
				department.getDepartmentName(),
				department.getDepartmentDescription()
				);
		
	}
	
	public static Department mapToDepartment(DepartmentDTO departmentDTO) {
		return new Department(
                departmentDTO.getId(),
                departmentDTO.getDepartmentName(),
                departmentDTO.getDepartmentDescription()
				);
		
	}
}
