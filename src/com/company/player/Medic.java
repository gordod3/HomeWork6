package com.company.player;

public class Medic extends Hero {
    private int damage = 0;
    private int heal;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public Medic(int health, int damage, int heal) {
        super(health, damage);
        this.heal = heal;
    }
}
