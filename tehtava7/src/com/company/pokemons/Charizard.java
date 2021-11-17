package com.company.pokemons;

import com.company.State;
import com.company.Context;

public class Charizard implements State {
    Context instance;

    public Charizard(Context instance){
        this.instance = instance;
    }

    @Override
    public void attack() {
        System.out.println("Charizard syöksee tulta");
        instance.gainExperience();
    }

    @Override
    public void move() {
        System.out.println("Charizard lentää");
    }

    @Override
    public void evolve() {
        System.out.println("Charizard ei voi enää kehittyä :(");
    }
}
