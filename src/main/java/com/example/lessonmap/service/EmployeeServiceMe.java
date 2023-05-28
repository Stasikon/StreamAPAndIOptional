package com.example.lessonmap.service;


import com.example.lessonmap.domain.Employee;
import com.example.lessonmap.exception.EmployeeAlreadyAddedException;
import com.example.lessonmap.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceMe implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceMe() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String fillName, String lastName) {
        Employee employee = new Employee(fillName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть");
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String fillName, String lastName) {
        Employee employee = new Employee(fillName, lastName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        employeeList.add(employee);
        throw new EmployeeNotFoundException("Такого сотрудника нету");

    }

    @Override
    public Employee find(String fillName, String lastName) {
        Employee employee = new Employee(fillName, lastName);
        if (employeeList.contains(employee)) {
            return employee;
        }
        employeeList.add(employee);
        throw new EmployeeNotFoundException("Такого сотрудника нету");
    }
    @Override
    public Collection<Employee> findAll() {
        return  Collections.unmodifiableList(employeeList);
    }
}



