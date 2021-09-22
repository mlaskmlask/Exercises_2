package com.company;

import javax.swing.*;

public class Main7 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 3 == 0)
                System.out.print(" Buzz");
            if (i % 5 == 0)
                System.out.print(" Fizz");

            System.out.println("");
        }
    }
}
