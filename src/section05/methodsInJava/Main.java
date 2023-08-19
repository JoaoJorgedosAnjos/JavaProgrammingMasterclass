package section05.methodsInJava;

public class Main {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100); //argument
        calculateScore(true, 10000, 8, 200);

        int highScore = calculateScore2(true, 800, 5, 100);
        System.out.println("The highScore is " + highScore);
    }

    //parameter
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    //methiod with return
    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
