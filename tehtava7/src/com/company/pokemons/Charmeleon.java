package com.company.pokemons;

import com.company.State;
import com.company.Context;

public class Charmeleon implements State {
    Context instance;

    public Charmeleon(Context instance){
        this.instance = instance;
    }
    @Override
    public void attack() {
        System.out.println("Charmeleon huitoo kynsillään");
        instance.gainExperience();
        if(instance.getExperience() >= 60){
            this.evolve();
        }
    }

    @Override
    public void move() {
        System.out.println("Charmeleon kävelee");
    }

    @Override
    public void evolve() {
        System.out.println("Charmeleon kehittyy Charizardiksi");
        instance.setPokemon(new Charizard(instance));
    }
}
