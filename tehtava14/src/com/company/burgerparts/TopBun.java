package com.company.burgerparts;

public class TopBun implements BurgerPart{
    private String description;

    public TopBun(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
