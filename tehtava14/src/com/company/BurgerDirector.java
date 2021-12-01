package com.company;

import com.company.burgerparts.BurgerPart;

import java.util.ArrayList;

public class BurgerDirector {

    public String makeHesBurger(HesBuilder builder){
        builder.setTopBun();
        builder.setMiddlePart();
        builder.setBottomBun();
        return builder.getBurger();
    }

    public ArrayList<BurgerPart> makeMcBurger(McBuilder builder){
        builder.setTopBun();
        builder.setMiddlePart();
        builder.setBottomBun();
        return builder.getBurger();
    }
}
