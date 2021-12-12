package com.company;

public class WhiteScreenDown implements Command{

    private WhiteScreen screen;

    public WhiteScreenDown(WhiteScreen whiteScreen){
        this.screen=whiteScreen;
    }
    @Override
    public void execute() {
        screen.WhitescreenDown();
    }
}
