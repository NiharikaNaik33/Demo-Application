package com.example.crud.demo.service;

import java.util.List;

import com.example.crud.demo.entity.Employee;

/**
 * EmployeeService handles the crud operations on Employee data.
 *
 * @author Niharika Naik
 *
 */
public interface EmployeeService {

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

}
