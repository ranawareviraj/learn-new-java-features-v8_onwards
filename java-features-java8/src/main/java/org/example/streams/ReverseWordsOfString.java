package org.example.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseWordsOfString {

    static Function<String, String> reverse = word -> {
        int left = 0;
        int right = word.length() - 1;

        char[] chars = word.toCharArray();

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    };

    public static void main(String[] args) {
        String str = "Java is a programming language";

        String[] words = str.split(" ");

/*        List<StringBuilder> reversedWordsList = Arrays.stream(words)
                .map(word -> new StringBuilder(word).reverse())
                .toList();

        System.out.println(reversedWordsList);*/

        // join reversed words: "avaJ si a gnimmargorp egaugnal"
        String collected = Arrays.stream(words)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(collected);


        collected = Arrays.stream(words)
                .map(reverse)
                .collect(Collectors.joining(" "));
        System.out.println(collected);

/*        Arrays.stream(words)
                .forEach(word -> System.out.print(new StringBuilder(word).reverse() + " ")) ;*/
    }
}
