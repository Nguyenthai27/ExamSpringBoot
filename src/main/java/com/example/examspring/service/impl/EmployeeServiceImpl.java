package com.example.examspring.service.impl;

import com.example.examspring.entity.Employee;
import com.example.examspring.reponsitory.EmployeeRepository;
import com.example.examspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void saveEmployee(Employee employee) {
        try {
            employeeRepository.save(employee);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public Employee findEmployeeById(Long id) {
        Employee employee = null;
        try{
            Optional<Employee> emp = employeeRepository.findById(id);
            if(emp.isPresent()){
                employee = emp.get();
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return employee;
    }
    @Override
    public List<Employee> findEmployeeByName(String name) {
        return null;
    }
}
