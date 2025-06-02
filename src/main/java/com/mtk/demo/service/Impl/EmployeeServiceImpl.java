package com.mtk.demo.service.Impl;

import com.mtk.demo.dto.EmployeeDTO;
import com.mtk.demo.dtomapper.EmployeeDtoMapper;
import com.mtk.demo.entity.Employee;
import com.mtk.demo.repository.EmployeeRepo;
import com.mtk.demo.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeDTO creatEmployee(EmployeeDTO employeeDTO) {
		Employee employee = EmployeeDtoMapper.mapToEmployee(employeeDTO);
		Employee saveEmployee = employeeRepo.save(employee);
		return EmployeeDtoMapper.mapToEmployeeDto(saveEmployee);
	}

	@Override
	public EmployeeDTO getAllEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		
	}

}
