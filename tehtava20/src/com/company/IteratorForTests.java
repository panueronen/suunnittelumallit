package com.company;

import java.util.ArrayList;

public class IteratorForTests {

    public static ArrayList<Integer> iterate(ArrayList<Integer> list){
        ArrayList<Integer> iterated = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)>10){
                iterated.add(list.get(i));
                System.out.println("Iterating");
            }
        }
        return iterated;
    }

}
