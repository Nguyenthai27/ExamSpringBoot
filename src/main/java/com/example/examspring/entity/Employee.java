package com.example.examspring.entity;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer wage;
    public Employee(String name, Integer wage) {
        this.name = name;
        this.wage = wage;
    }
}
