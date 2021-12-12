package com.company;

public class Button {

    Command cmd;
    public Button(Command cmd){
        this.cmd = cmd;
    }
    public void push(){
        cmd.execute();
    }
}
