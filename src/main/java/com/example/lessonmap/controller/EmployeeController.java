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
    public Employee addEmployee(@RequestParam String name,@RequestParam String surname) {
        return servise.add(name, surname);
    }
    @GetMapping("/remove")
    public Employee  removeEmployee(@RequestParam String name,@RequestParam String surname) {
        return servise.remove(name, surname);
    }
    @GetMapping("/find")
    public Employee  findEmployee(@RequestParam String name,@RequestParam String surname) {
        return servise.find(name, surname);
    }
    @GetMapping
    public Collection<Employee> findAll() {
        return servise.findAll();
    }
    }