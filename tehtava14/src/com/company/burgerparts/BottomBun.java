package com.company.burgerparts;

public class BottomBun implements BurgerPart{
    private String description;

    public BottomBun(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
