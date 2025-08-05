package me.andrew;

import java.util.Scanner;

public class mainCharacter{
    int mainHealth = 1500;
    int mainDmg;

    public void mainAttackRanger(Scanner sc, Ranger enemyRanger){
        int randomNum = (int)(Math.random()*5);
        System.out.println("Enter a number from 0 to 5 (chance for Critical): ");
        int choice2 = sc.nextInt();
        sc.nextLine();

        if(choice2 == randomNum){
            System.out.println("CRITICAL HIT!\n");
            mainDmg+=30;
            enemyRanger.health -= mainDmg;
            mainDmg-=30;
        }
        else{
            System.out.println("You landed a brutal hit!\n");
            enemyRanger.health -= mainDmg;
        }
    }

    public void mainAttackWarrior(Scanner sc, Warrior enemyWarrior){
        int randomNum = (int)(Math.random()*5);
        System.out.println("Enter a number from 0 to 5 (chance for Critical): ");
        int choice4 = sc.nextInt();
        sc.nextLine();

        if(choice4 == randomNum){
            System.out.println("CRITICAL HIT!\n");
            mainDmg += 30;
            enemyWarrior.health -= mainDmg;
            mainDmg -= 30;
        }
        else{
            System.out.println("You landed a brutal hit!\n");
            enemyWarrior.health -= mainDmg;
        }
    }

    public void mainAttackDragon(Scanner sc, Dragon enemyDragon){
        int randomNum = (int)(Math.random()*5);

        System.out.println("Enter a number from 0 to 5 (chance for CRITICAL): ");
        int choice6 = sc.nextInt();
        sc.nextLine();

        if(choice6 == randomNum){
            System.out.println("CRITICAL HIT\n");
            mainDmg += 30;
            enemyDragon.health -= mainDmg;
            mainDmg -= 30;
        }
        else{
            System.out.println("You landed a brutal hit!\n");
            enemyDragon.health -= mainDmg;
        }
    }

    public void chooseWeapon(Scanner sc){
        int choice;

        System.out.println("Choose a weapon to fight with!");
        System.out.println("1. Bow");
        System.out.println("2. Sword");
        System.out.println("3. Magic Staff");
        choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                System.out.println("Fine choice! The bow is a handy weapon!\n");
                mainDmg = 75;
                break;
            case 2:
                System.out.println("A true warrior right here!\n");
                mainDmg = 100;
                break;
            case 3:
                System.out.println("The magic staff is quite powerful! Careful how you use it!\n");
                mainDmg = 125;
                break;
            default:
                System.out.println("Invalid choice, fellow traveler!");
        }
    }
}