package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
Scanner console = new Scanner(System.in);
String name1 = console.nextLine();
String name2 = console.nextLine();
String name3 = console.nextLine();

System.out.println(name3);
System.out.println(name2.toUpperCase());
System.out.println(name1.toLowerCase());
    }
}
