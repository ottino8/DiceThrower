package com.dicethrower;

import static com.dicethrower.Application.anApplication;
import static com.dicethrower.ThrowRegisterFactory.*;

public class Main {

    //private static void runIteration();

    public static void main(String[] args) {

        ThrowRegisterFactory factory = aThrowRegisterFactory();

        ThrowRegister currentRegister;

        currentRegister = factory.build(args);

        currentRegister.createTosses();

        System.out.println("Variance: " + currentRegister.calcVariance());

        System.out.println(currentRegister.calcRepetiotons());

        Application program = anApplication();
    }

}
