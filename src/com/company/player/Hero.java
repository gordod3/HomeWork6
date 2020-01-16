package com.company.player;

public class Hero extends Player {
    private String AT;

    public String getAT() {
        return AT;
    }

    public void setAT(String AT) {
        this.AT = AT;
    }

    public Hero(int health, int damage){
        super(health, damage);
    }
}
