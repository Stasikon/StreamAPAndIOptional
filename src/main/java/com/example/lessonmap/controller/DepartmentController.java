package com.example.lessonmap.controller;


import com.example.lessonmap.domain.Employee;
import com.example.lessonmap.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Optional<Employee> maxDepSalary(@RequestParam("departmentId") Integer department) {
        return departmentService.maxDepSalary(department);
    }

    @GetMapping("/min-salary")
    public Optional<Employee> minDepSalary(@RequestParam("departmentID") Integer department) {
        return departmentService.minDepSalary(department);
    }

    @GetMapping(value = "/all", params = {"departmentID"})
    public List<Employee> printEmployeeToDepartment(@RequestParam("departmentID") Integer department) {
        return departmentService.printEmployeeToDepartment(department);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> printAllEmployee() {
        return departmentService.printAllEmployee();
    }
}
