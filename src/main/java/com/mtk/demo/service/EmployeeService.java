package com.mtk.demo.service;

import java.util.List;

import com.mtk.demo.dto.EmployeeDTO;

public interface EmployeeService {
	
	EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
	
	List<EmployeeDTO> getAllEmployee();
	
	EmployeeDTO getEmployeeById(Long employeeId);
	
	EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee);
	
	void deleteEmployee(Long employeeId);
}
