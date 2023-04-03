package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hex = "";
        if (decimalNumber <= 0) {
            return "";
        }
        while (decimalNumber != 0) {
            hex = HEX.charAt(decimalNumber % 16) + hex;
            decimalNumber = decimalNumber / 16;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        int num = 0;
        if (hexNumber == "" || hexNumber == null) {

            return 0;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            num = 16 * num + HEX.indexOf(hexNumber.charAt(i));
        }
        return num;
    }
}
