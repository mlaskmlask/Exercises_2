package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Średnia wyników testów \t Ocena");
        for (int i = 0; i < 30; i++)
            System.out.print("_");
        System.out.println("");
        System.out.printf("%-25s%-10s\n", "90-100", 5);
        System.out.printf("%-25s%-10s\n", "80-89", 4);
        System.out.printf("%-25s%-10s\n", "70-79", 3);
        System.out.printf("%-25s%-10s\n", "60-69", 2);
        System.out.printf("%-25s%-10s\n", "<60", 1);
        System.out.println("");

        System.out.println("Podaj wynik pierwszego testu:");
        double first = scanner.nextInt();

        System.out.println("Podaj wynik drugiego testu:");
        double second = scanner.nextInt();

        System.out.println("Podaj wynik trzeciego testu:");
        double third = scanner.nextInt();

        double average = (first + second + third) / 3;

        if (average >= 90)
            System.out.println("Twoja ocena to 5.");
        else if (average >= 80)
            System.out.println("Twoja ocena to 4.");
        else if (average>=70)
            System.out.println("Twoja ocena to 3");
        else if (average>=60)
            System.out.println("Twoja ocena to 2");

    }
}
