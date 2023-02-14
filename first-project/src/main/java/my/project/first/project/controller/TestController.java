package my.project.first.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import my.project.first.project.entity.Employee;
import my.project.first.project.sevice.EmployeeService;

@RestController
public class TestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public void saveEmployee(Employee employee) {
		this.employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll() {
		 return this.employeeService.getAllData();
	}

}
