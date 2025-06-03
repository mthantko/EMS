package com.mtk.demo.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mtk.demo.dto.DepartmentDTO;
import com.mtk.demo.dtomapper.DepartmentDtoMapper;
import com.mtk.demo.entity.Department;
import com.mtk.demo.exception.ResourceNotFoundException;
import com.mtk.demo.repository.DepartmentRepo;
import com.mtk.demo.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepo departmentRepo;

	@Override
	public DepartmentDTO createDepartment(DepartmentDTO departmentDTO) {
		Department department = DepartmentDtoMapper.mapToDepartment(departmentDTO);
		Department saveDepartment = departmentRepo.save(department);
		return DepartmentDtoMapper.mapToDepartmentDTO(saveDepartment);
	}

	@Override
	public DepartmentDTO getDepartmentById(Long departmentId) {
		Department department = departmentRepo.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department is not exist given id :" + departmentId));
		return DepartmentDtoMapper.mapToDepartmentDTO(department);
	}

	@Override
	public List<DepartmentDTO> getAllDepartmet() {
		List<Department> departments = departmentRepo.findAll();
		return departments.stream().map((department) -> DepartmentDtoMapper.mapToDepartmentDTO(department))
				.collect(Collectors.toList());

	}

	@Override
	public DepartmentDTO updateDepartment(Long departmentId, DepartmentDTO updatedDepartment) {
		Department department = departmentRepo.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department is not exist given id :" + departmentId));

		department.setDepartmentName(updatedDepartment.getDepartmentName());
		department.setDepartmentDescription(updatedDepartment.getDepartmentDescription());

		Department updateDepartments = departmentRepo.save(department);

		;
		return DepartmentDtoMapper.mapToDepartmentDTO(updateDepartments);
	}

	@Override
	public void deleteDepartment(Long departmentId) {
		Department department = departmentRepo.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department is not exist given id :" + departmentId));
	}

}
