package com.aronicaandres.sololearnchallanges.easyChallanges;

import java.util.Scanner;
/*
Task
Given the total number of colors of paint that you need, calculate and output
the total cost of your project rounded up to the nearest whole number.

Input Format
An integer that represents the number of colors that you want to purchase for your project.

Output Format
A number that represents the cost of your purchase rounded up to the nearest whole number.
*/
public class PaintCosts
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float colors = sc.nextFloat() *5f;
        float otherElements = 40;
        float cost = ((colors*0.1f) + colors) + ((otherElements *0.1f)+otherElements);
        int intCost = Math.round(cost);

        sc.close();

        System.out.print(intCost);

    }
}