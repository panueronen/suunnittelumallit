package com.company;

import com.company.burgerparts.Beef;
import com.company.burgerparts.BottomBun;
import com.company.burgerparts.BurgerPart;
import com.company.burgerparts.TopBun;

import java.util.ArrayList;

public class McBuilder implements HamBuilder{
    private ArrayList<BurgerPart> burger = new ArrayList<>();

    @Override
    public void reset() {
        burger.clear();
    }

    @Override
    public void setTopBun() {
        burger.add(new TopBun("Delicious Top Bun "));
    }

    @Override
    public void setMiddlePart() {
        burger.add(new Beef("Delicious Beeflike substance"));
    }

    @Override
    public void setBottomBun() {
        burger.add(new BottomBun("Delicious Bottom Bun"));
    }
    public ArrayList<BurgerPart> getBurger(){
        return this.burger;
    }

}
