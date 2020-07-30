package com.aronicaandres.sololearnchallanges.mediumChallanges;

import java.util.Scanner;
/*
Task:
Take a text that includes some random symbols and translate it into a text that has none of them.
The resulting text should only include letters and numbers.

Input Format:
A string with random symbols.

Output Format:
A string of the text with all the symbols removed.
*/
public class Symbols
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        sc.close();
        String salida = entrada.replaceAll("[\\W&&[^\\s]]", "");

        System.out.print(salida);
    }
}
