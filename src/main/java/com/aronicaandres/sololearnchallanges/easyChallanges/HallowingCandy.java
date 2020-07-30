package com.aronicaandres.sololearnchallanges.easyChallanges;

import java.util.Scanner;

/*
Task
Given the input of the total number of houses that you visited, what is the percentage chance
that one random item pulled from your bag is a dollar bill?

Input Format
An integer (>=3) representing the total number of houses that you visited.

Output Format
A percentage value rounded up to the nearest whole number.
*/
public class HallowingCandy
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();

        input.close();

        if (houses >= 3) {
            int c =  100 - (((houses - 2) * 100) / houses);
            System.out.println(c);
        }

    }
}
