package com.javarush.task.pro.task10.task1005;

/* 
Многосерийный предприниматель
*/

public class Building {
    private String type;

//    public Building(String type) {
//        this.type = type;
//    }

    public void initialize(String type){
        this.type = type;
        Building building = new Building();
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}
