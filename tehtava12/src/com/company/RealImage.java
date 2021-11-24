package com.company;

public class RealImage implements Image{
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void displayImageName() {
        System.out.println(this.filename);
    }
}
