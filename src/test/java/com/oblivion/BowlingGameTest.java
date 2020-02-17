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


}
