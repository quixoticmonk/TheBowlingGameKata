package com.oblivion;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void setup() {
        game = new BowlingGame();
    }

    @Test
    public void scoreShouldBeZeroAtStart() {
        game.roll(0);
        assertThat(game.score(), is(equalTo(0)));
    }

    @Test
    public void scoreZeroForAllZeroes() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertThat(game.score(), is(equalTo(0)));
    }

    @Test
    public void scoreForAllOnes() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertThat(game.score(), is(equalTo(20)));
    }

}
