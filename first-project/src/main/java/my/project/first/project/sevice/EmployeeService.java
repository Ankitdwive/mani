package my.project.first.project.sevice;

import java.util.List;

import my.project.first.project.entity.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee);
	public List<Employee> getAllData();
}
