package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mc = scanner.nextInt();
        double x = mc * 3.6;
        int km = (int)Math.round(x);
        System.out.println(km);

    }
}