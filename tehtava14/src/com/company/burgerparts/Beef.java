package com.company.burgerparts;

public class Beef implements BurgerPart{
    private String description;

    public Beef(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
