
package com.capgemini.UC2_EmployeePayrollApp.Repository;

import com.capgemini.UC2_EmployeePayrollApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
