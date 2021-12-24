package Predicates;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class pipeline {
    public static void main(String[] args) {
        Integer[] a = {2, 3, 10, 15, 6, 9, 7};

        Predicate<Integer> p = i -> i > 2;
        Predicate<Integer> even = i -> i % 2 == 0;

        //getResult(p.and(even), a);
        //getResult(p.and(even.negate()), a);
        getResult(p.or(even.negate()), a);
    }
    static void getResult(Predicate<Integer> i, Integer[] a) {
        Stream.of(a).forEach(m -> System.out.println(i.test(m)));
    }
}
