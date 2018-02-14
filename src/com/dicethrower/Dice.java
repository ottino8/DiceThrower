package com.dicethrower;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Dice
{
    private int Sides;

    private Random generator = new Random();

    public Dice(int n_sides)
    {
     Sides=n_sides;
    }

    public int noSides(){
        return Sides;
    }

    public int roll() {
        return generator.nextInt(Sides)+1;
    }
}
