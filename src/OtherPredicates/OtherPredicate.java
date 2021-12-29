package OtherPredicates;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;

public class OtherPredicate {
    public static void main(String[] args) {
       // IntPredicate p=i->i%2==0;
       // System.out.println(p.test(100));
        itf g=Student::new;
        System.out.println(g.set("Sumit","41").gerName());

        BiFunction<String,String, Student> f2 = (name,age) -> new Student(name,age);
        System.out.println(f2.apply("Riyaan","6").gerName());
    }
}
class Student{
    String name;
    String age;
    public Student(String name, String age){
        this.name=name;
        this.age=age;
    }
    String gerName(){
        return name;
    }
}
interface itf{
    public Student set(String name,String age);
}