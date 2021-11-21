package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int salary = 5000;
        int requestedSalary = 6000;

        Handler handler = new Supervisor(salary,requestedSalary);
    }
}
