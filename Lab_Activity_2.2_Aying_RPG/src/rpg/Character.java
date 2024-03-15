/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author CTU
 */
public class Character {
    
    private int health;
    private int damage;
    private int shield;

    public Character(int health, int damage, int shield) {
        this.health = health;
        this.damage = damage;
        this.shield = shield;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getShield() {
        return shield;
    }
    
    public void receiveDamage(int damage)
    {
        this. health -= (damage - shield);
        if(health <= 0){
          System.out.print("Character has died");
        }
    }
       
}


