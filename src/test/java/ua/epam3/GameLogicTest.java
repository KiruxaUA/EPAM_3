package ua.epam3;

import org.junit.Test;
import org.junit.Assert;

public class GameLogicTest {

    @Test
    public void getPlayersChoiceTest1() {
        Assert.assertEquals("rock", CHOICES.ROCK.getChoice());
    }

    @Test
    public void getPlayersChoiceTest2() {
        Assert.assertEquals("paper", CHOICES.PAPER.getChoice());
    }

    @Test
    public void getPlayersChoiceTest3() {
        Assert.assertEquals("scissors", CHOICES.SCISSORS.getChoice());
    }
}
