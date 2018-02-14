package com.dicethrower;

import java.util.Scanner;

import static com.dicethrower.ThrowRegisterFactory.*;



public class Application {

        private Scanner scanner = new Scanner(System.in);

        private ThrowRegisterFactory factory = aThrowRegisterFactory();

        private ThrowRegister currentRegister;

        private boolean Continue;



        public Application(){
                this.Continue = getCondition();
                runApplication();
        }

        private void runApplication(){
                while (Continue==true){

                        currentRegister = factory.build();

                        currentRegister.createTosses();

                        System.out.println("Variance: " + currentRegister.calcVariance());

                        System.out.println(currentRegister.calcRepetiotons());

                        Continue = getCondition();
                }
        }

        public boolean getCondition(){
                System.out.println("Input 0 to Exit: ");
                String str = scanner.nextLine();
                return str.trim().equals("0") ? false : true;
        }

        public static Application anApplication() {return new Application();}


}
