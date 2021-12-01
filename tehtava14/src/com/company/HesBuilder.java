package com.company;

public class HesBuilder implements HamBuilder{
    private StringBuilder burger = new StringBuilder();

    @Override
    public void reset() {
        burger.delete(0, burger.length());
    }

    @Override
    public void setTopBun() {
        burger.append("Delicious top bun ");
    }

    @Override
    public void setMiddlePart() {
        burger.append("Delicious Beeflike substance ");
    }

    @Override
    public void setBottomBun() {
        burger.append("Delicious bottom bun ");
    }

    public String getBurger(){
        return burger.toString();
    }
}
