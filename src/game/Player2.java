package game;

public class Player2 extends Player1{
    private boolean armour;
    private int health;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.armour = armour;
        this.health = health;
        if (health > 100) {
            this.health = 100;
        }
    }

    @Override
    public void damageGun1() {
        if(armour) {
            this.health -= 20;
            if(this.health <= 0) this.health = 0;
            System.out.println("Got hit by gun 1. Health is reduced by 20. Current health is " + this.health + ".");
        } if (!armour){
            this.health -= 30;
            if(this.health <= 0) this.health = 0;
            System.out.println("Got hit by gun 1. Health is reduced by 30. Current health is " + this.health + ".");
        }
        if(this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void damageGun2() {
        if(armour) {
            this.health -= 40;
            if(this.health <= 0) this.health = 0;
            System.out.println("Got hit by gun 1. Health is reduced by 40. Current health is " + this.health + ".");
        } if (!armour){
            this.health -= 50;
            if(this.health <= 0) this.health = 0;
            System.out.println("Got hit by gun 1. Health is reduced by 50. Current health is " + this.health + ".");
        }
        if(this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }
}
