package com.aronicaandres.sololearnchallanges.easyChallanges;

import java.util.Scanner;
/*
Task
Given the number of yards that your team moved forward, output either 'High Five' (for over 10),
'shh' (for <1), or a string that has a 'Ra!' for every yard that they gained.

Input Format
An integer value that represents the number of yards gained or lost by your team.

Output Format
A string of the appropriate cheer.
*/
public class CheerCreator
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int yards = sc.nextInt();

        sc.close();

        if (yards >= 1 && yards <= 10) {
            for(int i = 0 ; i < yards ; i++) {
                System.out.print("Ra!");
            }
        }
        if(yards > 10) {
            System.out.println("High Five");
        }
        if (yards <= 1) {
            System.out.println("shh");
        }
    }
}
