package com.oblivion;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BowlingGameTest {


    @Test
    public void scoreShouldBeZeroAtStart(){
        BowlingGame game = new BowlingGame();
        game.roll(0);
        assertThat(game.score(),is(equalTo(0)));
    }

    @Test
    public void scoreZeroForAllZeroes(){
        BowlingGame game = new BowlingGame();
        for(int i=0;i<20;i++) {
            game.roll(0);
        }
        assertThat(game.score(),is(equalTo(0)));
    }

    @Test
    public void scoreForAllOnes(){
        BowlingGame game = new BowlingGame();
        for(int i=0;i<20;i++) {
            game.roll(1);
        }
        assertThat(game.score(),is(equalTo(20)));
    }



}
