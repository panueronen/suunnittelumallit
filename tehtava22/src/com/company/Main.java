package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WhiteScreen screen = new WhiteScreen();
        Command up = new WhiteScreenUp(screen);
        Command down = new WhiteScreenDown(screen);
        Button upbutton = new Button(up);
        Button downbutton = new Button(down);

        downbutton.push();
        upbutton.push();
    }
}
