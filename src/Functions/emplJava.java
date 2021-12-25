package Functions;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class emplJava {
    public static void main(String[] args) {
        employee emp1 = new employee("Sumit", 41, 100000, "IT");
        employee emp2 = new employee("Guddu", 18, 10000, "IT");
        employee emp3 = new employee("Riyaan", 18, 12000, "IT");
        employee emp4 = new employee("Piyali", 35, 70000, "IT");
        ArrayList<employee> list =new ArrayList<employee>();
        list.add(emp1); list.add(emp2);list.add(emp3);list.add(emp4);
        Predicate<employee> p=i->i.age>20;
       list.stream().filter(m->p.test(m)).forEach(m->m.setSalary(m.Salary*2));

        for(employee e:list){
            System.out.println(e.Salary);
        }


    }
    
    
    
    
}
