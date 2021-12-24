package CollectionsManaging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] arg){

        List<Integer> myList= new ArrayList<>();

        myList.add(5);
        myList.add(20);
        myList.add(1);
        myList.add(9);

        Collections.sort(myList, (st1,st2)->((st1>st2)?-1:(st2<st1)?1:0));

        System.out.println(myList);




    }





}
