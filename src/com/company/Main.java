package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double bmi;

        System.out.println("Podaj swoją wagę");
        weight = scanner.nextDouble();

        System.out.println("Podaj swój wzrost w metrach");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("Twoje BMI wynosi %.2f.\n", bmi);

        if (bmi > 35) {
            System.out.println("Masz nadwagę.");
        } else if (bmi >= 18.5) {
            System.out.println("Twoja waga jest optymalna.");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę.");
        } else {
            System.out.println("Nieprawidłowe dane");
        }
    }
}

