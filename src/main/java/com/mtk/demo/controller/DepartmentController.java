package com.mtk.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtk.demo.dto.DepartmentDTO;
import com.mtk.demo.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/depatrments")
public class DepartmentController {
	
	private DepartmentService departmentService;
	
	@PostMapping
	public ResponseEntity<DepartmentDTO> createDepartment(@RequestBody DepartmentDTO departmentDTO) {
		DepartmentDTO saveDepartmet = departmentService.createDepartment(departmentDTO);
		return new ResponseEntity<>(saveDepartmet, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<DepartmentDTO> getEmployeeById(@PathVariable("id") Long departmentId) {
		DepartmentDTO departmentDTO = departmentService.getDepartmentById(departmentId);
		return ResponseEntity.ok(departmentDTO);

	}
	
	@PutMapping("{id}")
	public ResponseEntity<DepartmentDTO> updateEmployee(@PathVariable("id") Long departmentId,
			@RequestBody DepartmentDTO updateUepartmentDTO) {
		DepartmentDTO departmentDTO = departmentService.updateDepartment(departmentId, updateUepartmentDTO);
		return ResponseEntity.ok(updateUepartmentDTO);
	}
	
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> getAllEmployee() {
		List<DepartmentDTO> employees = departmentService.getAllDepartmet();
		return ResponseEntity.ok(employees);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
		departmentService.deleteDepartment(employeeId);
        return ResponseEntity.ok("Employee deleted successfully!.");
    }
	

}
