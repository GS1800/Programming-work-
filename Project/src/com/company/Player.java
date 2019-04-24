package com.company;

import java.util.Random;

/**
 * Created by Gs1800 on 4/23/2019.
 */
public class Player {

    private int health;
    private int defence;
    private int attack;
    private int playerlevel;

    public int getCoin() {
        return coin;
    }

    private int coin;

    Random rand;

    public Player() {
        rand = new Random();
        this.playerlevel = 1;
        health = 100;
    }
}