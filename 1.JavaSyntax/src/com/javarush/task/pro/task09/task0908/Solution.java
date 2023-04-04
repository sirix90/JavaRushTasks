package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    private static final String[] HEX = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    private static final String[] binaryArray = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "111111011111";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "3c";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String s = "0";
        String q = "";
        int counter = 0;
        if (binaryNumber == null) return q;
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = s + binaryNumber;
        }
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            s = binaryNumber.substring(i, i + 4);
            ++counter;
            for (int k = 0; k < binaryArray.length; k++) {
                if (binaryArray[k].equals(s)) {
                    q = q + HEX[k];
                }
            }
            if (q.length() < counter) {
                q = "";
            }
        }
        return q;
    }
    public static String toBinary(String hexNumber) {
        String q ="";
        int counter=0;
        if(hexNumber==null) return q;
        for (int i = 0; i < hexNumber.length(); i ++) {
            String s = hexNumber.substring(i,i+1);
            ++counter;
            for (int k = 0; k < HEX.length; k++) {
                if(s.equals(HEX[k])){
                    q=q+binaryArray[k];
                }
            }
            if(q.length()!=counter*4) q="";
        }
        return q;
    }
}
