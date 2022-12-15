package com.dmitriygoridov.spring.rest.dao;

import com.dmitriygoridov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
     List<Employee> getAllEmployees();
     void save(Employee employee);
     Employee getEmployee(int id);
     void deleteEmployee(int id);
}
