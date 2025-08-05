package me.andrew;

import java.util.Scanner;

public class Ranger extends Characters {
    mainCharacter obj2;
    mainGame coins;
    public Ranger(mainCharacter obj2, mainGame coins){
        super(300, 50);
        this.obj2 = obj2;
        this.coins = coins;
    }

    public void Level1(Scanner sc){
        System.out.println("You wonder through the forest and get ambushed by a Ranger!");
        obj2.chooseWeapon(sc);

        while(health > 0 && obj2.mainHealth>0){
            attackDmg = 50;
            System.out.println("Your health: "+obj2.mainHealth);
            System.out.println("Ranger's health: "+health);
            attack();
            obj2.mainAttackRanger(sc, this);
        }
        if(obj2.mainHealth <= 0){
            System.out.println("The ranger defeated you. GAME OVER!");
        }
        else if(health <= 0){
            System.out.println("\nYou have successfully defeated the ranger!");
            System.out.println("HP left: " + obj2.mainHealth+"\n");
            coins.coins=coins.coins + 50;
            System.out.println("You have acquired 50 coins!");
        }
    }

    @Override
    public int attack(){
        int randomNum = (int)(Math.random()*10);

        if(randomNum % 2 == 0 && randomNum < 4){
            System.out.println("The ranger landed a CRITICAL HIT!\n");
            attackDmg = 100;
            obj2.mainHealth -= attackDmg;
        }
        else{
            System.out.println("The ranger hits with his GLOWING ARROW!");
            obj2.mainHealth -= attackDmg;
        }
        return obj2.mainHealth;
    }
}