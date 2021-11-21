package com.company;

public interface Handler {
    public void giveARaise();
    public void nextHandler(Handler handler);
}
