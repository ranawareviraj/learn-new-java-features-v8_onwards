package org.example.streams.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_01 {

    public static void main(String[] args) {
        // 1. Create a list of only names of people
        Person[] peopleArr = ChallengeUtils.getPeople();
        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));
        List<String> peopleNames = people.stream()
                .map(Person::name)
                .toList();
        System.out.println(peopleNames);

        // 2. Create a list containing only Blue cars
        Car[] carsArr = ChallengeUtils.getCars();
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));
        List<Car> blueCars = cars.stream()
                .filter(car -> car.color().equals(ChallengeUtils.COLOR_BLUE))
                .collect(Collectors.toList());
        System.out.println(blueCars);

        // 3. Calculate total sum of salaries of all employees
        List<Employee> employees = ChallengeUtils.getEmployees();
        Double sumOfSalaries = employees.stream()
                .map(Employee::salary)
                .reduce(0d, (total, sal) -> total + sal);
        System.out.println(sumOfSalaries);

        // 4.1 Calculate average salary of all employees
        Double averageSalary = employees.stream()
                .map(Employee::salary)
                .mapToDouble(Double::doubleValue)
                .average().orElse(0d); // orElse(0d) is used to avoid NoSuchElementException (if stream is empty
        System.out.println(averageSalary);

        // 4.2 Calculate average salary of all employees
        averageSalary = employees.stream()
                .map(Employee::salary)
                .reduce(0d, Double::sum) / employees.size();
        System.out.println(averageSalary);
    }
}
