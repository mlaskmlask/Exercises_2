package com.company;

public class Main4 {
    public static void main(String[] args) {
        int[] tab = new int[1000];

        for (int i = 0; i < tab.length; i++)
            tab[i] = i+1;

        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }
}
