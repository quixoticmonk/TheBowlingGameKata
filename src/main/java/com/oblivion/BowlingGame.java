package com.oblivion;

public class BowlingGame {
    private int score = 0;
    private int[] rolls =new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        rolls[currentRoll++]=pins;
    }

    public int score() {
        int i=0;
        int frames;
        for(frames=0; frames<10;frames++){
            score+=rolls[i]+rolls[i+1];
            i+=2;
        }
        return score;
    }
}
