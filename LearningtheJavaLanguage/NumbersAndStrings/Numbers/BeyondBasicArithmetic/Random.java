package org.example;

public class Random {
    public static void main(String[] args) {
        // 1. Randomly generate a single number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = Math.random();
        System.out.println("Random double [0.0, 1.0): " + randomDouble);

        // 2. Randomly generate a single integer between 0 and 9
        int randomInt = (int) (Math.random() * 10);
        System.out.println("Random int [0, 10): " + randomInt);

        // 3. Randomly generate a series of numbers using java.util.Random
        java.util.Random rand = new java.util.Random();
        System.out.println("Random series using java.util.Random:");
        for (int i = 0; i < 3; i++) {
            int num = rand.nextInt(10); // generates 0 to 9
            System.out.println("  Number " + (i + 1) + ": " + num);
        }
    }
}

