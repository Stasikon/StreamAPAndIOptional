package com.example.lessonmap.domain;

import java.util.Objects;

public class Employee {
    private String fullName;
    private String lastName;

    public Employee(String fullName, String lastName) {
        this.fullName = fullName;
        this.lastName = lastName;
    }
    public String getFullName() {
        return fullName;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName) && Objects.equals(lastName, employee.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fullName, lastName);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
