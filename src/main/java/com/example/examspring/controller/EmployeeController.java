package com.example.examspring.controller;

import com.example.examspring.entity.Employee;
import com.example.examspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/getFormCreate")
    public String getFormCreate(ModelMap modelMap) {
        String view = "createOrFindEmployeeForm";
        try {
            Employee employee = new Employee();
            modelMap.addAttribute("employee", employee);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;
    }
    @PostMapping("/createOrFind")
    public String saveOrUpdate(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
        String view = "redirect:/employee/getAll";
        try {
            employeeService.saveEmployee(employee);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return  view;
    }
    @GetMapping("/getAll")
    public String getAll(ModelMap modelMap){
        String view = "listEmployee";
        try {
            List<Employee> employees = employeeService.getAllEmployee();
            modelMap.addAttribute("employees", employees);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;
    }

}
