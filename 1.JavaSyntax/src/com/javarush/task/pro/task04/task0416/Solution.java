package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ban = scanner.nextInt();
        int man = scanner.nextInt();
        double x = ban * 1.0 / man;
        System.out.println(x);

    }
}