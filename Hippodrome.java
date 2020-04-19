package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Hippodrome {

    private static List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    static Hippodrome game;

    void move() {
        horses.stream().forEach(Horse::move);
    }

    void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println();
        }

    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {
        return horses.stream().max(Comparator.comparing(Horse::getDistance)).orElse(null);
    }

    public void printWinner(){
        System.out.printf("Winner is %s!%n",getWinner().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        Horse horse1 = new Horse("Black", 3, 0);
        Horse horse2 = new Horse("White", 3, 0);
        Horse horse3 = new Horse("Gold", 3, 0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);


        game.run();
        game.printWinner();


    }
}
