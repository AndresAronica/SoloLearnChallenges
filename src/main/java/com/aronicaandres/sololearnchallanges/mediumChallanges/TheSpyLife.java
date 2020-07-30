package com.aronicaandres.sololearnchallanges.mediumChallanges;

import java.util.Scanner;
/*
Task:
Create a program that will take the encoded message, flip it around, remove any characters that
are not a letter or a space, and output the hidden message.

Input Format:
A string of characters that represent the encoded message.

Output Format:
A string of character that represent the intended secret message.
 */
public class TheSpyLife {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String inicial = sc.nextLine();
        String mejorado;
        StringBuilder ultimo = new StringBuilder();

        sc.close();

        mejorado = inicial.replaceAll("[^a-zA-Z- ]","");

        for (int i = 0; i < mejorado.length(); i++) {
            ultimo.append(mejorado.charAt(mejorado.length() - (i+1)));
        }

        System.out.println(ultimo);

    }

}
