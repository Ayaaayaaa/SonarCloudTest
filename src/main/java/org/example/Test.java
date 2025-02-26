package org.example;

import java.util.logging.Logger;

public class Test {
    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Test Analysis");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                LOGGER.info("i est 5 !");
            }
        }

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            LOGGER.severe("Erreur : Division par zéro ! " + e.getMessage());
        }
    }

    public void checkValue(int x) {
        if (x <= 0) {
            LOGGER.info("Négatif ou nul");
            return;
        }

        if (x >= 10) {
            LOGGER.info("Supérieur à 10");
            return;
        }

        String message = (x % 2 == 0) ? "Nombre pair" : "Nombre impair";
        LOGGER.info(message);
    }
}
