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

    @Test
    public void testOneSpare() {
        game.roll(5);
        game.roll(5);
        game.roll(5);
        rollMany(0, 17);
        assertThat(game.score(), is(equalTo(20)));
    }

    @Test
    public void testTwoSpares() {
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        rollMany(0, 16);
        assertThat(game.score(), is(equalTo(25)));
    }

    @Test
    public void testFourSpares() {
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        rollMany(0, 2);
        game.roll(7);
        game.roll(3);
        rollMany(0, 12);
        assertThat(game.score(), is(equalTo(35)));
    }

    private void rollMany(int pins, int numberOfThrows) {
        for (int i = 0; i < numberOfThrows; i++) {
            game.roll(pins);
        }
    }


}
