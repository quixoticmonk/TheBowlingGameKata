package com.oblivion;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BowlingGameTest {

    private BowlingGame game;
    int pins;
    int numberOfThrows;

    @Before
    public void setup() {
        game = new BowlingGame();
    }

    @Test
    public void scoreZeroForAllZeroes() {
        pins = 0;
        numberOfThrows = 20;
        rollMany(pins, numberOfThrows);
        assertThat(game.score(), is(equalTo(0)));
    }

    @Test
    public void scoreForAllOnes() {
        pins = 1;
        numberOfThrows = 20;
        rollMany(1, 20);
        assertThat(game.score(), is(equalTo(20)));
    }


    private void rollMany(int pins, int numberOfThrows) {
        for (int i = 0; i < numberOfThrows; i++) {
            game.roll(pins);
        }
    }


}
