import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisGameTest {

    @Test
    void player2WinsAPoint() {
            TennisGame game = new TennisGame();

            game.wonPoint("player 2");

            assertThat(game.getScore(), equalTo("0-15"));
        }

    @Test
    void player1WinsAPoint() {
        TennisGame game = new TennisGame();

        game.wonPoint("player 1");

        assertThat(game.getScore(), equalTo("15-0"));
    }

    @Test
    void bothPlayersScore() {
        TennisGame game = new TennisGame();

        game.wonPoint("player 1");
        game.wonPoint("player 2");

        assertThat(game.getScore(), equalTo("15-15"));
    }

    @Test

}
