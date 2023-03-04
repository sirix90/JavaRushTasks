package com.javarush.task.pro.task02.task0210;

/*
С каждым разом огромнее
*/

public class Solution {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);
        //int hugeAmount = i + j;

        System.out.println(hugeAmount);
    }
}