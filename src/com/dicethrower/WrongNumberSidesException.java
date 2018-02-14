package com.dicethrower;

public class WrongNumberSidesException extends RuntimeException {

    public WrongNumberSidesException(int noSides) {
        super("Wrong number of sides: " + noSides);
    }
}
