package com.example.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.demo.entity.Employee;

/**
 * EmployeeRepository responsible for Employee operations.
 * 
 * @author Niharika Naik
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
