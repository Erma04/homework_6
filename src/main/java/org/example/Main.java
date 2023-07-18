package org.example;

public class Main {
    public static void main(String[] args) {
        Weapon weaponBoss= new Weapon(WeaponType.HANDGUN,"Revolver");
        Boss myBoss = new Boss(1000,200,weaponBoss);
        System.out.println(myBoss.printInfo());

        Weapon weaponSkeleton1 = new Weapon(WeaponType.BOW,"Yumi");
        Skeleton myFirstSkeleton = new Skeleton(500,150,weaponSkeleton1,50);
        System.out.println(myFirstSkeleton.printInfo());

        Weapon weaponSkeleton2 = new Weapon(WeaponType.KNIFE,"Skeleton Knife");
        Skeleton mySecondSkeleton = new Skeleton(500,100,weaponSkeleton2,0);
        System.out.println(mySecondSkeleton.printInfo());



    }
}