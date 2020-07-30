package com.aronicaandres.sololearnchallanges.mediumChallanges;

import java.util.Scanner;
/*
Task:
Takes in a string, figure out the average length of all the words and return a number representing the average length.
Remove all punctuation. Round up to the nearest whole number.

Input Format:
A string containing multiple words.

Output Format:
A number representing the average length of each word, rounded up to the nearest whole number.
*/
public class AverageWordLength {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int x = 1;

        sc.close();

        String intermedio = input.replaceAll("[\\W&&[^\\s]]", "");

        for (int i = 0; i < intermedio.length(); i++) {
            if (intermedio.charAt(i) == 32) {
                x++;
            }

        }

        int resultado = intermedio.length() / x;

        System.out.println(resultado);

    }

}
