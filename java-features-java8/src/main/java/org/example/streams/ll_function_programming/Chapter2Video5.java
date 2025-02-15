package org.example.streams.ll_function_programming;
import java.util.function.BiFunction;

public class Chapter2Video5 {
    protected static class MyMath {
        public static Integer add(Integer x, Integer y) {
            return x + y;
        }

        public static Integer subtract(Integer x, Integer y) {
            return x - y;
        }

        public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply(2, 3);
        }
    }

    public static void main(String[] args) {
        System.out.println(MyMath.combine2And3(MyMath::add));
        System.out.println(MyMath.combine2And3(MyMath::subtract));
        System.out.println(MyMath.combine2And3((x, y) -> 2 * x + 2 * y));
    }
}
