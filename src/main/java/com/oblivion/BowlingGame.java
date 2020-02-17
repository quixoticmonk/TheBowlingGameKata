package com.oblivion;

public class BowlingGame {
    private int score = 0;
    private int[] rolls =new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        rolls[currentRoll++]=pins;
    }

    public int score() {
        for(int i=0; i<rolls.length;i++){
            score+=rolls[i];
        }
        return score;
    }
}
