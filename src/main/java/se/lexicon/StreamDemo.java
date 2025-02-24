package se.lexicon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);
        List<Integer> evenNumbersLessThan8 = numbers.stream()
                .filter(n -> n % 2 == 0) // intermediate operation
                .filter(n -> n < 8) // intermediate operation
                .collect(Collectors.toList()); // terminal operation

        System.out.println(evenNumbersLessThan8);

        System.out.println(numbers.stream().distinct().count()); // 10


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 30, 60000),
                new Employee("Bob", "Engineering", 35, 70000),
                new Employee("Charlie", "HR", 28, 50000),
                new Employee("David", "HR", 40, 45000),
                new Employee("Eve", "Finance", 32, 65000),
                new Employee("Frank", "Finance", 25, 55000),
                new Employee("Grace", "Engineering", 45, 80000)
        );

        // 1. Filter employees in the "Engineering" department earning more than 60k
        List<Employee> filteredEmployees = employees.stream() // source
                .filter(employee -> employee.getDepartment().equals("Engineering")) // intermediate operation
                .filter(employee -> employee.getSalary() > 60000) // intermediate operation
                .collect(Collectors.toList()); // terminal operation

        // 2. Get employee names sorted by salary
        List<String> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getSalary()))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

        // 3. Get unique departments (Extract department names)
        List<String> uniqueDepartments = employees.stream()
                .map(employee -> employee.getDepartment()) // produces a stream
                .distinct() // produces a stream
                .collect(Collectors.toList()); // produces a result

        System.out.println(uniqueDepartments);


    }
}
