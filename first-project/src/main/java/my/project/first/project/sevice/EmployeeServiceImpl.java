package my.project.first.project.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.project.first.project.entity.Employee;
import my.project.first.project.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllData() {
		return employeeRepo.findAll() ;
	}
	

}
