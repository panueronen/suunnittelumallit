package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTestB implements Runnable{

    private Thread t;
    private ArrayList<Integer> listOfNumbers;

    public IteratorTestB(ArrayList<Integer> list){
        this.listOfNumbers = list;
    }

    @Override
    public void run() {
        try{
            listOfNumbers = IteratorForTests.iterate(listOfNumbers);
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