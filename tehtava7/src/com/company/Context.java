package com.company;

import com.company.pokemons.Charmander;

public class Context {
    State pokemon;
    int experience;

    public Context(){
        this.pokemon = new Charmander(this);
        this.experience=0;
    }
    public int getExperience(){
        return this.experience;
    }
    public void setPokemon(State state){
        this.pokemon = state;
    }
    public void gainExperience(){
        this.experience = experience + 15;
    }
    public void attack(){
        pokemon.attack();
    }
    public void move(){
        pokemon.move();
    }
}
