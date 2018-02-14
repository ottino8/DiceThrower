package com.dicethrower;

public class ArgValidator {

    public void validateDiceThrows(int tosses, Dice dice) throws WrongNumberThrowsException {
        if (tosses % dice.noSides() != 0) {
            throw new WrongNumberThrowsException(dice, tosses);
        }
    }

    public void validateDiceSides(int sides) throws WrongNumberSidesException {
        if (sides < 2) {
            throw new WrongNumberSidesException(sides);
        }
    }
}
