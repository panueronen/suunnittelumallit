package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest implements Runnable{

    private Thread t;
    private final ArrayList<Integer> listOfNumbers;

    public IteratorTest(ArrayList<Integer> list){
        listOfNumbers = list;
    }

    @Override
    public void run() {
        try{
        Iterator<Integer> it = listOfNumbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
            Thread.sleep(50);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println(listOfNumbers);
    }

    public void start () {
        System.out.println("Starting ");
        if (t == null) {
            t = new Thread (this);
            t.start ();
        }
    }
}
