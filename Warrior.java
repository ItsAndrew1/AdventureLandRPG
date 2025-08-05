package me.andrew;

import java.util.Scanner;

public class Warrior extends Characters{
    mainCharacter obj3;
    mainGame coins;
    public Warrior(mainCharacter obj3, mainGame coins){
        super(700, 80);
        this.obj3 = obj3;
        this.coins = coins;
    }

    public void level2(Scanner sc){
        System.out.println("\n\n\nYou exit the forest and get to a castle. But watch out!");
        System.out.println("A fierce warrior want to challenge you!");
        obj3.chooseWeapon(sc);

        while(health > 0 && obj3.mainHealth > 0){
            attackDmg = 80;
            System.out.println("\nYour health: "+obj3.mainHealth);
            System.out.println("Warrior's health: "+health);
            attack();
            obj3.mainAttackWarrior(sc, this);
        }

        if(health <= 0){
            System.out.println("\nYou have successfully defeated the ranger!");
            System.out.println("HP left: "+obj3.mainHealth);
            coins.coins += 150;
            System.out.println("\nYou have acquired 150 coins!");
        }
        else if(obj3.mainHealth <= 0){
            System.out.println("The warrior defeated you. GAME OVER!");
        }
    }

    @Override
    public int attack(){
        int randomNum = (int)(Math.random()*10);

        if(randomNum % 2 != 0 && randomNum < 5){
            System.out.println("The warrior lands a CRITICAL HIT!");
            attackDmg = 110;
            obj3.mainHealth -= attackDmg;
        }
        else{
            System.out.println("The warrior CRUSHES HIS SWORD!");
            obj3.mainHealth -= attackDmg;
        }
        return obj3.mainHealth;
    }
}