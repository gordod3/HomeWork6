package com.company.player;

public class Warrior extends Hero implements SuperPower {
    public Warrior(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void superPower() {
        System.out.println("Warrior use hes super power.");
    }
}
