package com.aronicaandres.sololearnchallanges.mediumChallanges;

import java.util.Scanner;
/*
Task:
Create a program that parses through a link, extracts and outputs the YouTube video ID.

Input Format:
A string containing the URL to a YouTube video. The format of the string can be in
"https://www.youtube.com/watch?v=kbxkq_w51PM" or the shortened "https://youtu.be/KMBBjzp5hdc" format.

Output Format:
A string containing the extracted YouTube video id.
*/
public class YoutubeLinkFinder {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String inicial = sc.nextLine();
        String[] intermedio = inicial.split("((https://)(www\\.youtube\\.com/watch\\?v=)(youtu\\.be/)*)");

        sc.close();

        StringBuilder ultimo = new StringBuilder();

        for (String s : intermedio) {
            if (!s.equals("")) {
                ultimo.append(s);
            }
        }

        System.out.println(ultimo);
    }

}