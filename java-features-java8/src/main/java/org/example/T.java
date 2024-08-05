package org.example;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T {
    public static void main(String[] args) {
        OptionalDouble result = sumStream(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        System.out.println(result.orElse(0));

        "abcaab".chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> System.out.println(k + ": " + v));

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);
        Stream<Integer> sequentialStream = myList.stream();

        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); //filter numbers greater than 90
        System.out.print("High Nums greater than 90=");
        highNums.forEach(p -> System.out.print(p + " "));
        //prints "High Nums greater than 90=91 92 93 94 95 96 97 98 99 "

        extracted();

        extracted1();

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]
        System.out.println();


        Stream<List<String>> namesOriginalList = Stream.of(List.of("Pankaj"), Arrays.asList("David", "Lisa", "Tom"), List.of("Amit", "Hank"));
        //flat the stream from List<String> to String stream

        Stream<String> flatStream = namesOriginalList.flatMap(strList -> strList.stream());
        flatStream.forEach(System.out::println);

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> intOptional = numbers.reduce((i, j) -> i * j);
        //120


        intOptional.ifPresent(integer -> System.out.println("\nMultiplication = " + integer));


        Stream<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5);

        System.out.println("Number of elements in stream = " + numbers1.count()); //5


        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5);
        numbers2.forEach(i -> System.out.print(i + ",")); //1,2,3,4,5,


        Stream<Integer> numbers3 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("\nStream contains 4? => " + numbers3.anyMatch(i -> i == 4));
        //Stream contains 4? true

        Stream<Integer> numbers4 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("\nStream contains all elements less than 10? => " + numbers4.allMatch(i -> i < 10));
        //Stream contains all elements less than 10? true

        Stream<Integer> numbers5 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("\nStream doesn't contain 10? => " + numbers5.noneMatch(i -> i == 10));
        //Stream doesn't contain 10? true


        //David
        Stream<String> names4 = Stream.of("Pankaj", "Amit", "David", "Lisa", "Dan");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        firstNameWithD.ifPresent(s -> System.out.println("\nFirst Name starting with D = " + s));
    }

    private static void extracted1() {
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]
    }

    private static void extracted() {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(String::toUpperCase).collect(Collectors.toList()));
        //prints [ABC, D, EF]
    }

    private static OptionalDouble sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).average();
    }
}
