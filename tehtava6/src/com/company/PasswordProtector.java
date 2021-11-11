package com.company;

import java.util.Scanner;

public class PasswordProtector extends DataGuard {
    Scanner scanner = new Scanner(System.in);

    public PasswordProtector(IDataAccess data){
        super(data);
    }

    @Override
    public IDataAccess getData() {
        if(access()){
            return data.getData();
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
