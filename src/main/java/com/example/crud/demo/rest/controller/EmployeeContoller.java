package com.example.crud.demo.rest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.demo.entity.Employee;
import com.example.crud.demo.service.EmployeeService;
import com.sun.istack.NotNull;

/**
 * <P>
 * This EmployeeContolleris a REST implementation in the presence of Spring
 * Boot. This class provides methods for employee related operations.
 * </P>
 * 
 * @author Niharika Naik
 */
@RestController
public class EmployeeContoller {

    @Autowired
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Store the employee record.
     * 
     * @param employee
     */

    @PostMapping("/employee")
    public void saveEmployee(@NotNull @Validated @RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    /**
     * Retrieve Employee.
     * 
     * @return Employee List.
     */
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeService.retrieveEmployees();
        return employees;
    }

    /**
     * Get Employee by id.
     * 
     * @param id
     * @return Employee record.
     */
    @GetMapping("/employees/{ID}")
    public Employee getEmployeeById(@PathVariable(name = "ID") Long id) {
        Employee employee = null;
        try {
            employee = employeeService.getEmployee(id);
        } catch (NoSuchElementException exp) {
            throw new RuntimeException("id not found in DB");
        }
        return employee;
    }

    /**
     * Delete employee by Id.
     * 
     * @param id
     */
    @DeleteMapping("/employees/{ID}")
    public void deleteEmployee(@PathVariable(name = "ID") Long id) {
        try {
            employeeService.deleteEmployee(id);
        } catch (EmptyResultDataAccessException exception) {
            throw new RuntimeException("Id not found");
        }
    }

}
