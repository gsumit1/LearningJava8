package Functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnFunctions {
    public static void main(String[] args) {
        Integer[] a = {2, 10, 4, 1, 3, 5};
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> {
            return i * i;
        };
        ArrayList<Integer> list = (ArrayList<Integer>) Stream.of(a)
                .filter(m -> p.test(m))
                .map(m -> f.apply(m))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
