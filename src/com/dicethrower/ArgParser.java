package com.dicethrower;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArgParser {

    private Scanner scanner = new Scanner(System.in);
    private ArgValidator validator = new ArgValidator();

    public int getSides(String arg) {
        try {
            int sides = Integer.parseInt(arg);
            validator.validateDiceSides(sides);
            return sides;
        } catch (NumberFormatException | InputMismatchException | WrongNumberSidesException e) {
            System.err.println("Please input correct number of sides");
            return promptSides();
        }
    }

    public int promptSides() {
        String sidesString = scanner.nextLine();
        return getSides(sidesString);
    }

    public int getThrows(String arg, Dice dice) {
        try {
            int tosses = Integer.parseInt(arg);
            validator.validateDiceThrows(tosses, dice);
            return tosses;
        } catch (NumberFormatException | InputMismatchException | WrongNumberThrowsException e) {
            System.err.println("Please input the correct number of throws:");
            return promptThrows(dice);
        }
    }

    public int promptThrows(Dice dice) {
        String throwsString = scanner.nextLine();
        return getThrows(throwsString, dice);
    }

}


