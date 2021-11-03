package com.company;

public class AdidasTehdas implements Tehdas {
    private String merkki = "Adidas";

    @Override
    public TPaita luoTPaita() {
        return new TPaita(){
            @Override
            public String toString(){
                return merkki + " T-Paita";
            }
        };

    }

    @Override
    public Farmarit luoFarmarit() {
        return new Farmarit(){
            @Override
            public String toString(){
                return merkki + " Farmarit";
            }
        };

    }

    @Override
    public Lippis luoLippis() {
        return new Lippis(){
            @Override
            public String toString(){
                return merkki + " Lippis";
            }
        };
    }

    @Override
    public Kengat luoKengat() {
        return new Kengat(){
            @Override
            public String toString(){
                return merkki + " Kengat";
            }
        };
    }
}
