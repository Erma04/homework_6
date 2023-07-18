package org.example;

public class Boss extends GameEntity{
    private Weapon weapon;
    public Boss(int health, int damage, Weapon weapon){
        super(health, damage);
        this.weapon=weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Health: "+getHealth()+", Damage: "+getDamage()+", Weapon Type: "+getWeapon().getWeaponType()+", Weapon Name: "+getWeapon().getNameWeapon();
    }
}
