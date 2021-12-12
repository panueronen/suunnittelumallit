package com.company;

public class WhiteScreenUp implements Command{

    private WhiteScreen screen;

    public WhiteScreenUp(WhiteScreen whiteScreen){
        this.screen=whiteScreen;
    }
    @Override
    public void execute() {
        screen.WhiteScreenUp();
    }
}
