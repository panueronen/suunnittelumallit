package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tehdas tehdas;
        Jasper jasper;


        if (args.length <1 || "adidas".equals(args[0])) {
            tehdas = new AdidasTehdas();
        }else{
            tehdas = new BossTehdas();
        }

        jasper = new Jasper(tehdas.luoLippis(), tehdas.luoTPaita(), tehdas.luoFarmarit(), tehdas.luoKengat());

        System.out.println(jasper.paalla());

        /*
        jasper.vaihdavaatteet(tehdas.luoLippis(), tehdas.luoTPaita(), tehdas.luoFarmarit(), tehdas.luoKengat());
        System.out.println(jasper.paalla());
         */
    }
}
