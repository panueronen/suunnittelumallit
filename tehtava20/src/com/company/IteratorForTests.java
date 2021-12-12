package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorForTests {

    public static ArrayList<Integer> iterate(ArrayList<Integer> list){
        ArrayList<Integer> iterated = new ArrayList<>();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        return iterated;
    }

}
