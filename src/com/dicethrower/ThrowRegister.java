package com.dicethrower;

public class ThrowRegister {

    private int[] tosses;
    private int[] elementSides;
    private int noThrows;
    private float mean;
    private Dice dice;

    public ThrowRegister(Dice dice, int noThrows) {
        this.dice = dice;
        this.noThrows = noThrows;
        tosses = new int[noThrows];
        elementSides = new int[dice.noSides()];
        mean = 0;
    }

    public int getNoThrows() {
        return noThrows;
    }

    public int getNoSides() {
        return dice.noSides();
    }

    public void createTosses() {
        for (int i = 0; i < noThrows; i++) {
            tosses[i] = dice.roll();
            mean += tosses[i];
            elementSides[tosses[i]-1]++;
        }
        mean /= noThrows;
    }


    public float calcVariance() {
        float variance = 0;
        for (int i = 0; i < noThrows; i++) {
            variance += ((mean - tosses[i])*(mean - tosses[i]));
        }
        variance /= (noThrows);
        return variance;
    }

    public String calcRepetiotons() {
        String repetition = "Side \tRepeats\n";

        for (int i=0; i<elementSides.length; i++) {
            repetition += ""+ (i+1) + "   \t" + elementSides[i] + "\n";
        }
        return repetition;
    }
}
