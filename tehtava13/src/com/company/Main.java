package com.company;

import com.company.visitor.BonusVisitor;
import com.company.visitor.Visitor;

public class Main {

    public static void main(String[] args) {

        Player[] players = new Player[4];
        for(int i = 0; i < players.length; i ++){
            players[i] = new Player(Integer.toString(i));
        }

        players[0].takeDamage();
        players[2].takeDamage();
        players[2].takeDamage();

    Visitor v = new BonusVisitor();

    for(int i = 0; i < players.length;i++){
        players[i].accept(v);
    }

    for (int i = 0; i < players.length; i++){
        System.out.println(players[i].getPoints());
    }
    
    }
}
