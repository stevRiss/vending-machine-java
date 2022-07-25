package org.example.dao;

public enum Coins {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25),
    HALFDOLLAR(50);

    private final int value;

    Coins(int value){
        this.value = value;
    }

    private int getValue(){
        return value;
    }

    public String toString(){
        switch(this){
            case PENNY:
                return "1";
            case NICKEL:
                return "5";
            case DIME:
                return "10";
            case QUARTER:
                return "25";
            case HALFDOLLAR:
                return "50";
        }
        return null;
    }
}
