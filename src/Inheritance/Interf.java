package Inheritance;

public interface Interf {

    default void method(String arg){
        System.out.println(arg);
    }

}
