package me.andrew;

import java.util.Scanner;

public class Dragon extends Characters{
    mainCharacter obj4;
    mainGame coins;
    Main obj5 = new Main();
    public Dragon(mainGame coins, mainCharacter obj4){
        super(1000, 110);
        this.coins = coins;
        this.obj4 = obj4;
    }

    public void levelLast(Scanner sc){
        System.out.println("\n\n\nYou get past the castle, and you enter the dark Dragon Lair...");
        obj4.chooseWeapon(sc);

        while(health > 0 && obj4.mainHealth > 0){
            attackDmg = 110;
            System.out.println("Your health: "+obj4.mainHealth);
            System.out.println("Dragon's health: "+health);
            attack();
            obj4.mainAttackDragon(sc, this);
        }
        if(health <= 0){
            System.out.println("Congrats, "+ obj5.getName()+"! You defeated the dragon and recovered the Lost Artifact!\n");
            System.out.println("HP left: "+obj4.mainHealth);
        }
        else if(obj4.mainHealth <= 0){
            System.out.println("The Dragon defeated you. GAME OVER!");
        }
    }

    @Override
    public int attack(){
        int randomNum = (int)(Math.random()*10);

        if(randomNum % 2 == 0 && randomNum < 6){
            System.out.println("The dragon lands a CRITICAL HIT!");
            attackDmg = 140;
            obj4.mainHealth -= attackDmg;
        }
        else{
            System.out.println("The dragon hits you with his CLAWS!");
            obj4.mainHealth -= attackDmg;
        }
        return obj4.mainHealth;
    }
}