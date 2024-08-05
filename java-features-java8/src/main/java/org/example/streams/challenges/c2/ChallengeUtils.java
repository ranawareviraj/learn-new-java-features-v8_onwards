package org.example.streams.challenges.c2;

import java.util.Arrays;

public class ChallengeUtils {

    private ChallengeUtils() {
    }

    static Person[] getPeople() {
        return new Person[]{
                new Person("Brandon", Arrays.asList(new Email("test1@test.com"), new Email("test2@test.com"))),
                new Person("Hank", Arrays.asList(new Email("test3@test.com"), new Email("test4@test.com"))),
                new Person("Jenna", Arrays.asList(new Email("test5@test.com"), new Email("test6@test.com"))),
                new Person("Veronica", Arrays.asList(new Email("test7@test.com"), new Email("test8@test.com"))),
                new Person("Jack", Arrays.asList(new Email("test9@test.com"), new Email("test10@test.com")))
        };
    }
}
