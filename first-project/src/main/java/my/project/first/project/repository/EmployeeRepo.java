package my.project.first.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.project.first.project.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
