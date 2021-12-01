package com.company;

public class Main {

    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();
        HesBuilder hesbuilder = new HesBuilder();
        director.makeHesBurger(hesbuilder);
        System.out.println(hesbuilder.getBurger());


        McBuilder mcBuilder = new McBuilder();
        director.makeMcBurger(mcBuilder);
        System.out.println(mcBuilder.getBurger());

    }
}
