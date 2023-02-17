package com.eployeemanagement.employee.repository;

import com.eployeemanagement.employee.entity.EmployeeEntity;
import com.eployeemanagement.employee.services.EmployeeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
