package me.andrew;

import java.util.Scanner;

public class mainGame{
    int coins = 0;
    mainCharacter hero = new mainCharacter();
    public void adventureLeveling(Scanner sc){
        Ranger level1 = new Ranger(hero, this);
        level1.Level1(sc);
        Warrior level2 = new Warrior(hero, this);
        Dragon levelLast = new Dragon(this,hero);

        System.out.print("Do you want to spend them? (yes/no)");
        String choice2 = sc.nextLine();

        if(choice2.equalsIgnoreCase("yes")){
            coinShop1(sc, level2);
        }
        else{
            level2.level2(sc);
        }

        System.out.println("Do you want to spend them? (yes/no)");
        String choice5 = sc.nextLine();

        if(choice5.equalsIgnoreCase("yes")){
            coinShop2(sc, levelLast);
        }
        else{
            levelLast.levelLast(sc);
        }
    }

    public void coinShop1(Scanner sc, Warrior level2){
        int choice3;

        do{
            System.out.println("\n\n-------COIN SHOP-------");
            System.out.println("Your coins: "+coins);
            System.out.println("1. Lesser Potion of Health (+50 hp) - 50 COINS");
            System.out.println("2. Greater Potion of Health (+100 hp) - 100 COINS");
            System.out.println("3. Exit shop (go to the next level)");
            choice3 = sc.nextInt();
            sc.nextLine();

            if(choice3 == 1){
                if(coins >= 50){
                    System.out.println("Successfully bought Lesser Potion of Health!");
                    hero.mainHealth+=50;
                    coins -= 50;

                }
                else{
                    System.out.println("You don't have enough coins!\n");
                }
            }
            else if(choice3 == 2){
                if(coins >= 100){
                    System.out.println("Successfully bought Greater Potion of Health!");
                    hero.mainHealth+=100;
                    coins-=100;
                }
                else{
                    System.out.println("You don't have enough coins!\n");
                }
            }
            else if(choice3 == 3){
                level2.level2(sc);
            }
            else{
                System.out.println("Invalid option!");
            }
        }while(choice3 != 3);
    }

    public void coinShop2(Scanner sc, Dragon levelLast){
        int choice7;

        do{
            System.out.println("\n\n-------COIN SHOP-------");
            System.out.println("Your coins: "+coins);
            System.out.println("1. Lesser Potion of Health (+50 hp) - 50 COINS");
            System.out.println("2. Greater Potion of Health (+100 hp) - 100 COINS");
            System.out.println("3. Exit shop (go to the Last Level)");

            choice7 = sc.nextInt();
            sc.nextLine();

            if(choice7 == 1){
                if(coins >= 50){
                    System.out.println("Successfully bought Lesser Potion of Health!");
                    hero.mainHealth+=50;
                    coins -= 50;

                }
                else{
                    System.out.println("You don't have enough coins!\n");
                }
            }
            else if(choice7 == 2){
                if(coins >= 100){
                    System.out.println("Successfully bought Greater Potion of Health!");
                    hero.mainHealth+=100;
                    coins-=100;
                }
                else{
                    System.out.println("You don't have enough coins!\n");
                }
            }
            else if(choice7 == 3){
                levelLast.levelLast(sc);
            }
            else{
                System.out.println("Invalid choice!");
            }
        }while(choice7 != 3);
    }
}