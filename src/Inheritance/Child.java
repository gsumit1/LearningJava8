package Inheritance;


public class Child extends parent {
    public static void  main(String[] arg){
        System.out.println("child");
        new parent().method("Hello");
    }
}
