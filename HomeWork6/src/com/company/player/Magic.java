package com.company.player;

public class Magic extends Hero implements SuperPower {
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void superPower() {
        System.out.println("Magic use his super power.");
    }
}
