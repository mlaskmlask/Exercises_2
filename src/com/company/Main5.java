package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szukany numer:");
        int number = scanner.nextInt();
        for (int search : numbers) {
            if (search == number) {
                System.out.println("Znaleziono!");
                break;
            }else{
                System.out.println("Nie znaleziono");
                break;
            }
        }
    }
}

