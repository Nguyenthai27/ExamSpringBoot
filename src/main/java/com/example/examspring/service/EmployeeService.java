package com.example.examspring.service;

import com.example.examspring.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employee employees);

    Employee findEmployeeById(Long id);

    List<Employee> findEmployeeByName(String name);

}
