package Predicates;

import java.util.function.Predicate;

public class PredicatesExample {

    public static void main(String[] arg){
        Predicate<Integer> p=i->i>10;
        System.out.println(p.test(11));


        Predicate<String> strings=s->s.length()>10;
        System.out.println(strings.test("Sumit"));



    }
}
