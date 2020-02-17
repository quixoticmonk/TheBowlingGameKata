package com.oblivion;

public class BowlingGame {
    private int score = 0;
    private int[] rolls = new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int frameIndex = 0;
        int frames;
        for (frames = 0; frames < 10; frames++) {
            if(rolls[frameIndex]==10){
                score+=10+rolls[frameIndex + 1]+rolls[frameIndex + 2];
                frameIndex+=1;
            }
            else if (rolls[frameIndex] + rolls[frameIndex + 1] == 10) {
                score += 10 + rolls[frameIndex + 2];
                frameIndex += 2;
            } else {
                score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }

        }
        return score;
    }
}
