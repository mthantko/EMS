package com.mtk.demo.service;

import com.mtk.demo.dto.EmployeeDTO;

public interface EmployeeService {
	
	EmployeeDTO creatEmployee(EmployeeDTO employeeDTO);
	
	EmployeeDTO getAllEmployee(Long employeeId);
	
	EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee);
	
	void deleteEmployee(Long employeeId);
}
