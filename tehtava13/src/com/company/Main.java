package com.company;

import com.company.visitor.BonusVisitor;
import com.company.visitor.Visitor;

public class Main {

    public static void main(String[] args) {
	Player player1 = new Player("Jake");
    Player player2 = new Player("Nea");
    Player player3 = new Player("Laurie");
    Player player4 = new Player("Bill");

    player1.takeDamage();
    player1.takeDamage();
    player3.takeDamage();

    Visitor v = new BonusVisitor();

    player1.getPoints();
    player2.getPoints();
    player3.getPoints();
    player4.getPoints();



    }
}
