package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Clock clock = new Clock();
        clock.advance();
        System.out.println(clock.getTime());


        Clock clock2 = clock.clone();
        clock.advance();
        clock.advance();
        System.out.println(clock.getTime());
        System.out.println(clock2.getTime());
    }
}
