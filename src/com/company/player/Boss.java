package com.company.player;

public class Boss extends Player {
    private String DT;

    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
    }

    public Boss(int health, int damage) {
        super(health, damage);
    }
}
