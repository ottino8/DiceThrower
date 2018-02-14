package com.dicethrower;

public class WrongNumberThrowsException extends RuntimeException {

    public WrongNumberThrowsException(Dice dice, int noThrows){
        super("Wrong number of Throws" + noThrows);
    }
}
