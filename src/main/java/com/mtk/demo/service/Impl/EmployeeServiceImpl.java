package com.mtk.demo.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mtk.demo.dto.EmployeeDTO;
import com.mtk.demo.dtomapper.EmployeeDtoMapper;
import com.mtk.demo.entity.Employee;
import com.mtk.demo.exception.ResourceNotFoundException;
import com.mtk.demo.repository.EmployeeRepo;
import com.mtk.demo.service.EmployeeService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
		Employee employee = EmployeeDtoMapper.mapToEmployee(employeeDTO);
		Employee saveEmployee = employeeRepo.save(employee);
		return EmployeeDtoMapper.mapToEmployeeDto(saveEmployee);
	}

	@Override
	public EmployeeDTO getEmployeeById(Long employeeId) {
		Employee employee = employeeRepo.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee is not exist given id :" + employeeId));
		return EmployeeDtoMapper.mapToEmployeeDto(employee);
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		List<Employee> employees = employeeRepo.findAll();
		return employees.stream().map((employee) -> EmployeeDtoMapper.mapToEmployeeDto(employee))
				.collect(Collectors.toList());
	}

	@Override
	public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee) {
		Employee employee = employeeRepo.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee is not exist given id :" + employeeId));

		employee.setFirstName(updatedEmployee.getFirstName());
		employee.setLastName(updatedEmployee.getLastName());
		employee.setEmail(updatedEmployee.getEmail());

		Employee updateEmployees = employeeRepo.save(employee);
		return EmployeeDtoMapper.mapToEmployeeDto(updateEmployees);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		Employee employee = employeeRepo.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee is not exist given id :" + employeeId));
	}

}
