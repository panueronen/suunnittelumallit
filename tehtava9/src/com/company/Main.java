package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        String[] strs = {"js", "java", "Python", "Typescript", "C#", "C++", "C", "GO", "Ruby", "Rust"};
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(strs));

        Context context = new Context(new AfterEachStrategy());
        System.out.println(context.convert(strings));

        context.setConverter(new AfterEveryotherStrategy());
        System.out.println(context.convert(strings));

        context.setConverter(new EveryThirdStrategy());
        System.out.println(context.convert(strings));

    }
}
