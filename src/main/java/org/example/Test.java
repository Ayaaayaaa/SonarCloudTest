package org.example;

public class Test {

    public static void main(String[] args) {
        int unusedVariable = 10;

        System.out.println("Test Analysis");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("i est 5 !");
            }
        }

        try {
            int result = 10 / 0;
        } catch (Exception e) {

        }
    }

    public void checkValue(int x) {
        if (x > 0) {
            if (x < 10) {
                if (x % 2 == 0) {
                    System.out.println("Nombre pair");
                } else {
                    System.out.println("Nombre impair");
                }
            } else {
                System.out.println("Supérieur à 10");
            }
        } else {
            System.out.println("Négatif ou nul");
        }
    }
}
