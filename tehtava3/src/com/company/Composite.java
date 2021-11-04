package com.company;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Componentti{
    private String nimi;
    private int price;
    private List<Componentti> componenttilist;

    public Composite(int price, String nimi){
        this.nimi=nimi;
        this.price=price;
        componenttilist=new ArrayList<>();
    }

    public void addComponent(Componentti componentti){
        componenttilist.add(componentti);
    }

    public void removeComponent(Componentti componentti){
        componenttilist.remove(componentti);
    }

    @Override
    public int getPrice() {
        int total=price;
        System.out.println(this.nimi + " " + this.price);
        for (int i = 0; i<componenttilist.size();i++){
            total = total + componenttilist.get(i).getPrice();
        }
        return total;
    }
}
