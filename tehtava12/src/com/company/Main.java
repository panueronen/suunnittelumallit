package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ProxyImage> album = new ArrayList<ProxyImage>();
        album.add(new ProxyImage("HiRes_10MB_Photo1"));
        album.add(new ProxyImage("HiRes_10MB_Photo2"));

        //Tämä tulostaa vain tiedostojen nimet lataamatta kuvia
        for(int i = 0; i < album.size(); i++){
            album.get(i).displayImageName();
        }

        //Tämä tulostaa kuvat jos niitä ei ole vielä ladattu
        for(int i = 0; i < album.size(); i++){
            album.get(i).displayImage();
        }
    }
}
