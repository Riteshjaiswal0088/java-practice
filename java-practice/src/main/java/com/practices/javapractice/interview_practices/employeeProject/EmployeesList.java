package com.practices.javapractice.interview_practices.employeeProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesList {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("dheeraj", 10000));
        employees.add(new Employee("ram", 5000));
        employees.add(new Employee("shyam", 7000));
        employees.add(new Employee("shyness", 11000));
        employees.add(new Employee("shankar", 15000));

        List<String> collect = employees.stream()
                .filter(employee -> employee.getEmployeeSalary() >= 10000)
                .map(Employee::getEmployeeName)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
