package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(secret.equalsIgnoreCase(name) ? "доступ разрешен" : "доступ запрещен");
        //напишите тут ваш код
        //System.out.println("доступ запрещен");
    }
}
