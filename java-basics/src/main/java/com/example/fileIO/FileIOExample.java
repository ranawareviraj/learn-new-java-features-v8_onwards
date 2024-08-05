package com.example.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileIOExample {

    public static final String INPUT_PATH = "/Users/viru/code/programming-practice/learn-new-java-features-v8_onwards/java-basics/src/main/resources/input.txt";
    public static final String OUTPUT_PATH = "/Users/viru/code/programming-practice/learn-new-java-features-v8_onwards/java-basics/src/main/resources/output.txt";

    public static void main(String[] args) {
        // Reading from a file using try-with-resources
        try (BufferedReader reader = Files.newBufferedReader(
                Path.of(INPUT_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to a file using try-with-resources
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(OUTPUT_PATH),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {
            writer.write("Hello, this is a sample text.\n");
            writer.write("Adding another line.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Java 8 style
        // Reading from a file using try-with-resources
        try {
            Files.lines(Path.of(INPUT_PATH)).forEach(System.out::println);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

