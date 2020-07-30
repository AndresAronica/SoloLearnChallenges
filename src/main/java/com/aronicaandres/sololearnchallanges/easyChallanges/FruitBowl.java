package com.aronicaandres.sololearnchallanges.easyChallanges;

import java.util.Scanner;
/*
Task
Your task is to evaluate the total number of pies that you can make with the apples
that are in your bowl given to total amount of fruit in the bowl.

Input Format
An integer that represents the total amount of fruit in the bowl.

Output Format
An integer representing the total number of whole apple pies that you can make.
*/
public class FruitBowl
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fruit = input.nextInt();

        input.close();

        int apples = fruit/2;

        int pies = apples/3;

        if ((apples % 3) == 0) {
            pies = apples/3;
        }

        System.out.println(pies);

    }
}