package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int name = path.indexOf("jdk"), ver = path.indexOf("/", name);
        String result = path.substring(0, name) + jdk + path.substring(ver);
        return result;
    }
}
