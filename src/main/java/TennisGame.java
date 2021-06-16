public class TennisGame {

    String score;
    int playerOneScore = 0;
    int playerTwoScore = 0;

    public void wonPoint(String winner) {
        if (winner.equals("player 1")) {
            playerOneScore = playerOneScore + 15;
        } else {
            playerTwoScore = playerTwoScore + 15;
        }
    }


    public String getScore() {
        return playerOneScore + "-" + playerTwoScore;
    }
}
