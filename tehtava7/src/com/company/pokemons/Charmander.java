package com.company.pokemons;

import com.company.State;
import com.company.Context;

public class Charmander implements State {
    Context instance;
    public Charmander(Context instance){
        this.instance = instance;
    }
    @Override
    public void attack() {
        System.out.println("Charmander syöksee tulta");
        instance.gainExperience();
        if(instance.getExperience()>= 20){
            this.evolve();
        }
    }

    @Override
    public void move() {
        System.out.println("Charmander kävelee");
    }

    @Override
    public void evolve() {
        System.out.println("Charmander kehittyy Charmeleoniksi!");
        instance.setPokemon(new Charmeleon(instance));
    }

}
