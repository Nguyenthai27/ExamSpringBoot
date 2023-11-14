package com.example.examspring.reponsitory;
import com.example.examspring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findEmployeeByName(String name);

    void save(Employee employee);
}
