package com.aronicaandres.sololearnchallanges.easyChallanges;

import java.util.Scanner;
/*
Task
Given the number of siblings that you are giving popsicles to, determine if you can give them each
an even amount or if you shouldn't mention the popsicles at all.

Input Format
Two integer values, the first one represents the number of siblings, and the second one represents
the number of popsicles that you have left in the box.

Output Format
A string that says 'give away' if you are giving them away,
or 'eat them yourself' if you will be eating them yourself.
*/
public class Popsicles
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int siblings = input.nextInt();
        int popsicles = input.nextInt();

        input.close();

        if ((popsicles % siblings) == 0) {
            System.out.println("give away");
        } else {
            System.out.println("eat them yourself");
        }

    }
}