package com.company;

public class Main {

    public static void main(String[] args) {
        Context pokemon = new Context();

        for(int i = 0; i < 10; i++){
            pokemon.move();
            pokemon.attack();
        }

    }
}
