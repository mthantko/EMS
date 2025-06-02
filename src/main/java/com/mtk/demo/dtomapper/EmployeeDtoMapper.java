package com.mtk.demo.dtomapper;

import com.mtk.demo.dto.EmployeeDTO;
import com.mtk.demo.entity.Employee;

public class EmployeeDtoMapper {
	
	
	public static EmployeeDTO mapToEmployeeDto(Employee employee){
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
