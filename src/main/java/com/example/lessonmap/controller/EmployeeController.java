package com.example.lessonmap.controller;


import com.example.lessonmap.domain.Employee;
import com.example.lessonmap.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService servise;

    public EmployeeController(EmployeeService servise) {
        this.servise = servise;
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String fullName,@RequestParam String lastName) {
        return servise.add(fullName, lastName);
    }
    @GetMapping("/remove")
    public Employee  removeEmployee(@RequestParam String fullName,@RequestParam String lastName) {
        return servise.remove(fullName, lastName);
    }

    @GetMapping("/add")
    public Employee  findEmployee(@RequestParam String fullName,@RequestParam String lastName) {
        return servise.find(fullName, lastName);
    }
    @GetMapping
    public Collection<Employee> findAll() {
        return servise.findAll();
    }
    }


