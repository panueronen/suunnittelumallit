package com.company;

public class CEO implements Handler{

    public CEO(int salary, int requestedSalary){
        giveARaise();
    }
    @Override
    public void giveARaise() {
        System.out.println("Of course here you go - The CEO");
    }

    @Override
    public void nextHandler(Handler handler) {
        //There is no bigger boss then me
    }
}
