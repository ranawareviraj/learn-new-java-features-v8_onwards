package org.example.streams.challenges.c2;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Person> list = List.of(ChallengeUtils.getPeople());
        List<String> list1 = list.stream()
                .flatMap(p -> p.emails().stream()
                        .map(Email::email))
                .toList();

        System.out.println(list1);
    }
}
