package com.example.crud.demo.rest.controller.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.crud.demo.entity.Employee;
import com.example.crud.demo.rest.controller.EmployeeContoller;
import com.example.crud.demo.service.EmployeeService;

/**
 * Test case for EmployeeController
 * 
 * @author Niharika Naik
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

    @InjectMocks
    private EmployeeContoller employeeContoller;

    @Mock
    private EmployeeService employeeService;

    @Test
    void testEmployeeSave() {
        Employee employee = new Employee();
        employee.setAge(60);
        employee.setName("Brijesh");
        Mockito.verify(employeeService, Mockito.times(1)).saveEmployee(employee);
        employeeContoller.saveEmployee(employee);
    }

    @Test
    void testGetEmployee() {
        Employee employee = new Employee();
        employee.setAge(60);
        employee.setId(1L);
        employee.setName("Brijesh");
        List<Employee> employeeList = new ArrayList<>();
        List<Employee> employeeData = new ArrayList<>();
        employeeList.add(employee);
        Mockito.when(employeeService.retrieveEmployees()).thenReturn(employeeList);
        employeeData = employeeContoller.getEmployees();
        assertNotNull(employeeData);
        assertEquals(employeeData, employeeList);
    }

    @Test
    void testGetEmployeeById() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setAge(60);
        employee.setName("Brijesh");
        List<Employee> employeeList = new ArrayList<>();
        Employee employeeData = null;
        employeeList.add(employee);
        Mockito.when(employeeService.getEmployee(1L)).thenReturn(employee);
        employeeData = employeeContoller.getEmployeeById(1L);
        assertNotNull(employeeData);
        assertEquals(employeeData, employeeList);
    }
}
