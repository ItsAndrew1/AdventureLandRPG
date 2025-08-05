package me.andrew;

import java.util.Scanner;

public class Main{
    private static String name;
    public static void main(String[] args){
        Main obj1 = new Main();
        mainGame redirect = new mainGame();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Adventure Land!");
        System.out.println("Enter your characters name: ");
        obj1.setName(sc.nextLine());
        System.out.println(name + ", good luck throughout this adventure!\n");
        redirect.adventureLeveling(sc);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}