package com.aronicaandres.sololearnchallanges.mediumChallanges;

import java.util.Scanner;
/*
Task:
If you are given a string of random letters, your task is to evaluate whether any letter is repeated in the string
or if you only hit unique keys while you typing.

Input Format:
A string of random letter characters (no numbers or other buttons were pressed).

Output Format:
A string that says 'Deja Vu' if any letter is repeated in the input string,
or a string that says 'Unique' if there are no repeats.
 */
public class DejaVu {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String control = sc.nextLine();
        int cantidad = 1;

        sc.close();

        for (int i = 0 ; i < control.length(); i++) {
            if ( (i > 0) && (control.charAt(i) != control.charAt(i-1))) {
                cantidad++;
            }
        }

        if (cantidad < control.length()) {
            System.out.println("Deja Vu");
        } else {
            System.out.println("Unique");
        }

    }

}
