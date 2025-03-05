package com.bridgelabz.EmployeePayrollApp.Repository;
import com.bridgelabz.EmployeePayrollApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
