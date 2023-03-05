package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean i = scanner.nextBoolean();
        if (i == true) {
            int opt = (int) Math.ceil(glass);
            System.out.println(opt);
        } else {
            int pes = (int) Math.floor(glass);
            System.out.println(pes);
        }

    }
}