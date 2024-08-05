package org.example.streams.challenges;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge_02 {

    public static void main(String[] args) {
/*
        // With Lambda
        List<ChallengeUtils.Employee> employees = ChallengeUtils.getEmployees();
        Map<String, Float> averageSalariesMap = employees.stream()
                .collect(Collectors.groupingBy((employee -> employee.jobTitle())))
                .entrySet()
                .stream()
                .collect(Collectors.toMap((entry -> entry.getKey()),
                        entry -> entry.getValue()
                                .stream()
                                .map(employee -> employee.salary())
                                .reduce(0f, (acc, x) -> acc + x) / entry.getValue().size()));
        System.out.println(averageSalariesMap);
        */

        // With method reference
        List<Employee> employees = ChallengeUtils.getEmployees();
        Map<String, Double> averageSalariesMap = employees.stream()
                .collect(Collectors.groupingBy((Employee::jobTitle)))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .map(Employee::salary)
                                .reduce(0d, Double::sum) / entry.getValue().size()));
        System.out.println(averageSalariesMap);


        averageSalariesMap = employees.stream()
                .collect(Collectors.groupingBy((Employee::jobTitle)))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .map(Employee::salary)
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0d)
                ));
        System.out.println(averageSalariesMap);

        // emp -> sort by name -> role
        List<Employee> empList = employees.stream()
                .sorted(Comparator.comparing(Employee::name).thenComparing(Employee::jobTitle))
                .toList();
        System.out.println(empList);
    }
}