package com.company;

public class LeafComponentti implements Componentti{
    private String nimi;
    private int price;

    public LeafComponentti(int hinta, String nimi){
        this.nimi=nimi;
        this.price=hinta;
    }

    @Override
    public int getPrice() {
        System.out.println(this.nimi + " " + this.price);
        return price;
    }
}
