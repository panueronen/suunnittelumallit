package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String merkki = "adidas";
        Tehdas tehdas;
        Jasper jasper;

        tehdas = new AdidasTehdas();

        jasper = new Jasper(tehdas.luoLippis(), tehdas.luoTPaita(), tehdas.luoFarmarit(), tehdas.luoKengat());

        System.out.println(jasper.paalla());

        tehdas = new BossTehdas();
        jasper.vaihdavaatteet(tehdas.luoLippis(), tehdas.luoTPaita(), tehdas.luoFarmarit(), tehdas.luoKengat());
        System.out.println(jasper.paalla());



    }
}
