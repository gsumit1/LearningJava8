package Predicates;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartsWithNameString {
    public static void main(String[] args) {
        String[] a = {"Kmail", "Kala", "Mala", "", null, "Hela", "tiklo", "Kranti"};
        Predicate<String> strings = t -> t.startsWith("K");
        Predicate<String> strings1 = t -> t.length()>4;
        Predicate<String> strings2 = t ->  t!=null && t.length()!=0;
        ArrayList<String> al=(ArrayList<String>)Stream.of(a).filter(m -> strings2.and(strings).and(strings1).test(m)).collect(Collectors.toList());
        System.out.println(al);
    }
}
