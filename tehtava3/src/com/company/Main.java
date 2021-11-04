package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LeafComponentti nayttis = new LeafComponentti(1300,"rtx 3080");
        LeafComponentti rammuistit = new LeafComponentti(150, "ddr 4 Kingston");
        LeafComponentti prosessori = new LeafComponentti(600, "amd 6900x");
        Composite emolevy = new Composite(300,"Asus Battleaxe");
        Composite kotelo = new Composite(100,"RGB BOX ULTRACUBE");

        kotelo.addComponent(emolevy);

        emolevy.addComponent(nayttis);
        emolevy.addComponent(rammuistit);
        emolevy.addComponent(prosessori);

        System.out.println(kotelo.getPrice());

        System.out.println(emolevy.getPrice());

    }
}
