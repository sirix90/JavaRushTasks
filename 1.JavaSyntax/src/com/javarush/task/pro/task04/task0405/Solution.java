package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String word = sc.nextLine();
            if (word.equals("enough"))
                break;
            else {
                System.out.println(word);
            }
        }

    }
}