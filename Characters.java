package me.andrew;

public class Characters{
    protected int health, attackDmg;

    public Characters(int health, int attackDmg){
        this.attackDmg = attackDmg;
        this.health = health;
    }

    public int attack(){
        System.out.println("attacks with no fear!\n\n");
        return 0;
    }
}