package com.javarush.task.task21.task2113;

/*
1. В методе move класса Horse значение поля distance должно увеличиваться на расстояние пройденное за один
"ход"(значение поля speed) умноженное на случайное число от нуля до единицы полученное с помощью вызова метод Math.random().
 */

public class Horse {
    public String name;
    public double speed;
    public double distance;


    public Horse(String nam, double spe, double dist) {

        name = nam;
        speed = spe;
        distance = dist;

    }

    public void move() {

        distance += (speed * Math.random());
    }

    public void print() {
        for (int i = 0; i < (int)distance; i++) {
            System.out.print(".");
        }
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}

