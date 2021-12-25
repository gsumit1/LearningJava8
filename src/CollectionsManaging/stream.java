package CollectionsManaging;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class stream {
    public static void main(String[] arg){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(3);
        a.add(4);
        a.add(19);
        a.add(20);
        a.add(7);
        a.add(8);
        System.out.println( a.stream().filter(i->i%2==0).collect(Collectors.toList()));
        System.out.println( a.stream().map(i->i*2).collect(Collectors.toList()));
        System.out.println( "Maximum value :"+ a.stream().max((i1,i2)->i1.compareTo(i2)).get());
        System.out.println( "Maximum value :"+ a.stream().min((i1,i2)->i1.compareTo(i2)).get());
        a.stream().forEach(i-> System.out.print(i));
        Integer[]b=a.stream().toArray(Integer[]::new);
        for(int c: b) System.out.println(c);
        Double[] d= new Double[]{1.5, 4.6, 88.9, 9.5, 3.0, 10.7};
        Stream<Double> s=Stream.of(d);
        s.forEach(System.out::println);
        System.out.println(a.stream().anyMatch(i->i==20));






    }
}
