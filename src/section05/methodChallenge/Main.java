package section05.methodChallenge;

public class Main {
    public static void main(String[] args) {
        int highScorePostion = calculateHighScorePosition(1500);
        displayHighScorePosition("Marco", highScorePostion);

        highScorePostion = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePostion);

        highScorePostion = calculateHighScorePosition(500);
        displayHighScorePosition("Lucas", highScorePostion);

        highScorePostion = calculateHighScorePosition(100);
        displayHighScorePosition("James", highScorePostion);

        highScorePostion = calculateHighScorePosition(25);
        displayHighScorePosition("Maria", highScorePostion);

    }

    public static void displayHighScorePosition(String playerName, int highScorePostion) {
        System.out.printf("%s managed to get into postion %d on the high socre list\n", playerName, highScorePostion);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000)
            return 1;
        else if (playerScore >= 500)
            return 2;
        else if (playerScore >= 100)
            return 3;
        return 4;
    }
}
