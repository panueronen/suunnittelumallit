package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Digitalclock testingclock = new Digitalclock();
        Digitalclock testingclock2 = new Digitalclock();
        Clock.getinstance().addObserver(testingclock);
        Clock.getinstance().addObserver(testingclock2);
        Clock.getinstance().tick();
        Clock.getinstance().tick();

    }
}
