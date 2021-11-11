package com.company;

public class Main {

    public static void main(String[] args) {
        IDataAccess data = new PasswordProtector(new PasswordProtector(new Data("secret_info")));
        IDataAccess data2 = new Data("not secret info");

        System.out.println(data.getData());
        System.out.println(data2.getData());
    }
}
