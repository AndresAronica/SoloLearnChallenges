package com.aronicaandres.sololearnchallanges.mediumChallanges;

import java.util.Scanner;
/*
Task:
Find the sum of all even integers in a list of numbers.

Input Format:
The first input denotes the length of the list (N). The next N lines contain the list elements as integers.

Output Format:
An integer that represents the sum of only the even numbers in the list.
*/
public class ThatsOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int i = 0;
        int x;
        int total = 0;
        while (length > i) {

            x = sc.nextInt();
            if((x % 2) == 0) {
                total += x;
            }
            i++;
        }
        sc.close();
        System.out.println(total);

    }

}
