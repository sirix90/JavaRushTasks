package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean num12 = (num1 == num2);
        boolean num23 = (num2 == num3);
        boolean num13 = (num1 == num3);
        if (num12 && num23 && num13)
        {
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        else if (num12)
        {
            System.out.println(num1 + " " + num2);
        }
        else if (num23)
        {
            System.out.println(num2 + " " + num3);
        }
        else if (num13)
        {
            System.out.println(num1 + " " + num3);
        }
    }

}
