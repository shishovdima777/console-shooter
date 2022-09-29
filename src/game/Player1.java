package game;

public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        if (health > 100) {
            this.health = 100;
        }
    }

    public void damageGun1() {
        this.health -= 30;
        if (this.health <=0) {
            this.health = 0;
        }
        System.out.println("Got hit by gun 1. Health is reduced by 30. Current health is " + getHealth() + ".");
        if(this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

    public  void damageGun2() {
        this.health -=50;
        if(this.health <=0) {
            this.health = 0;
        }
        System.out.println("Got hit by gun 2. Health is reduced by 50. Current health is " + getHealth() + ".");
        if(this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

    public void medKit() {
        if(getHealth() > 0) {
            this.health += 50;
            if(getHealth() > 100) {
                this.health = 100;
            }
            System.out.println("Used med kit. Health increased on 50hp. Current health is " + getHealth() + ".");
        } else {
            System.out.println("Can't use med kit. " + getName() + " is dead.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
