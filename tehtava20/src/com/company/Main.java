package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i < 15; i++){
            list.add(i);
        }
        System.out.println(list);


        //Task part A
        /*



        IteratorTest R1 = new IteratorTest(list);
        IteratorTest R2 = new IteratorTest(list);
        R1.start();
        R2.start();
        System.out.println("***End of Task A ***");

         */
        
        IteratorTestB R3 = new IteratorTestB(list);
        IteratorTestB R4 = new IteratorTestB(list);
        R3.start();
        R4.start();


    }
}
