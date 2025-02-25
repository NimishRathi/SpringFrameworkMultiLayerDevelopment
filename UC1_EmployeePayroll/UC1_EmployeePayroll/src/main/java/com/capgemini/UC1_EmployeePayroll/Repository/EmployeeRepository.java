package com.capgemini.UC1_EmployeePayroll.Repository;

import com.capgemini.UC1_EmployeePayroll.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}