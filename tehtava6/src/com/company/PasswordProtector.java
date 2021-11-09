package com.company;

import java.util.Scanner;

public class PasswordProtector extends DataGuard {
    Scanner scanner = new Scanner(System.in);

    public PasswordProtector(Data data){
        super(data);
    }

    @Override
    public Data getData() {
        if(access()){
            return data;
        }
        return null;
    }
    private boolean access(){
        String password = "pass";
        System.out.println("give password");
        if(scanner.nextLine().equals(password)){
            System.out.println("Password correct");
            return true;
        }
        System.out.println("Password incorrect");
        return false;

    }
}
