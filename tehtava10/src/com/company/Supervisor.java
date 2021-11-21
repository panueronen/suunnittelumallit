package com.company;

public class Supervisor implements Handler{

    public Supervisor(int salary, int requestedSalary){
        if(requestedSalary >= salary*1.02){
            nextHandler(new DepartmentHead(salary,requestedSalary));
        }else{
            giveARaise();
        }
    }
    @Override
    public void giveARaise() {
        System.out.println("Here is your raise -Your Supervisor");
    }

    @Override
    public void nextHandler(Handler handler) {
        System.out.println("I cant give you a raise so I must ask my superior -Your Supervisor");
    }
}
