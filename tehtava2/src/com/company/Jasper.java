package com.company;

import java.lang.reflect.Array;

public class Jasper {
    private Lippis lippis;
    private TPaita tPaita;
    private Farmarit farmarit;
    private Kengat kengat;

    public Jasper(Lippis lippis, TPaita paita, Farmarit farmarit, Kengat kengat){
        this.lippis=lippis;
        this.tPaita=paita;
        this.farmarit=farmarit;
        this.kengat=kengat;
    }
    public void vaihdavaatteet(Lippis lippis, TPaita paita, Farmarit farmarit, Kengat kengat){
        this.lippis=lippis;
        this.tPaita=paita;
        this.farmarit=farmarit;
        this.kengat=kengat;
    }

    public String paalla(){
        return this.lippis +" "+ this.kengat + this.farmarit + this.tPaita;
    }
}
