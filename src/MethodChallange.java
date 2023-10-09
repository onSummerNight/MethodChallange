package src;

public class MethodChallange {
    public static void main(String[] args) {
        int playPos = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playPos);

        playPos = calculateHighScorePosition(999);

        displayHighScorePosition("Tam",playPos);

        playPos = calculateHighScorePosition(499);

        displayHighScorePosition("Tum",playPos);

        playPos = calculateHighScorePosition(99);

        displayHighScorePosition("Tom",playPos);

        playPos = calculateHighScorePosition(-1000);

        displayHighScorePosition("Tem",playPos);
    }

    public static void displayHighScorePosition(String playerName, int playerPos) {

        System.out.println(playerName + " managed to get into position " + playerPos + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int playerHighScore = 4;

        if (playerScore >= 1000){
            playerHighScore = 1;
        } else if (playerScore >= 500){
            playerHighScore = 2;
        } else if (playerScore >= 100){
            playerHighScore = 3;
        }

        return playerHighScore;
    }

}
