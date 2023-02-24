package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean a = true;
        String number;
        int plus = 0;

        while (a){
            number = input.nextLine();
            if (number.equals("ENTER")){
                System.out.println(plus);
                a = false;
            }
            else {
                int b = Integer.parseInt(number);
                plus = plus + b;
            }
        }
    }
}
