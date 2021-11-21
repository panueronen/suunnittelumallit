package com.company;

public class DepartmentHead implements Handler{
    public DepartmentHead(int salary, int requestedSalary){
        if(requestedSalary >= salary*1.05){
            nextHandler(new CEO(salary,requestedSalary));
        }else{
            giveARaise();
        }
    }

    @Override
    public void giveARaise() {
        System.out.println("Here is your raise -Department Head");
    }

    @Override
    public void nextHandler(Handler handler) {
        System.out.println("I cant give such a big raise. Let me ask my superior");
    }
}
