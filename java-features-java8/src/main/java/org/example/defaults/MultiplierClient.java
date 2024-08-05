package org.example.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 2, 3);
        System.out.println(new MultiplierImpl().multiply(list));
    }
}
