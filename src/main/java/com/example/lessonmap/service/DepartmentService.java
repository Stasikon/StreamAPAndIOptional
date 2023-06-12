package com.example.lessonmap.service;

import com.example.lessonmap.domain.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {

    List<Employee> printEmployeeToDepartment(Integer department);

    Map<Integer, List<Employee>> printAllEmployee();

    Optional<Employee> minDepSalary(Integer department);

    Optional<Employee> maxDepSalary(Integer department);
}
