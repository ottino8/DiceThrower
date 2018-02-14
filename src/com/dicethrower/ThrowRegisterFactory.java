package com.dicethrower;

public class ThrowRegisterFactory {

    ArgParser parser = new ArgParser();

    public ThrowRegister build(String[] args) {
        return args.length == 2 ? build(args[0], args[1]) : build();
    }


    public ThrowRegister build(String sides, String tosses) {
        int noSides = parser.getSides(sides);
        Dice dice = new Dice(noSides);
        int noThrows = parser.getThrows(tosses, dice);
        return new ThrowRegister(dice, noThrows);
    }

    public ThrowRegister build() {
        System.out.println("Enter the Number of Sides:");
        int noSides = parser.promptSides();
        Dice dice = new Dice(noSides);
        System.out.println("Enter the Number of Throws:");
        int noThrows = parser.promptThrows(dice);
        return new ThrowRegister(dice, noThrows);
    }

    public static ThrowRegisterFactory aThrowRegisterFactory() {
        return new ThrowRegisterFactory();
    }
}
