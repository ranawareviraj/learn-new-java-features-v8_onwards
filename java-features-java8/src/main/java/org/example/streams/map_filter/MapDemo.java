package org.example.streams.map_filter;

import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getEmployees();

        // Add 1000 to each employee's salary
        employees.stream()
                .map(employee -> {
                    employee.setSalary(employee.getSalary() + 1000);
                    return employee;
                })
                .forEach(employee -> System.out.println(employee.getName() + " : " + employee.getSalary()));

        List<String> list = employees.stream()
                .map(Employee::getName)
                .toList();
        System.out.println("Names: " + list);
    }
}
