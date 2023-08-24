package section05.ExpressionsStatementsAndMore.keywordsAndExpressions;

public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.60934);
        //all line is a valid statement "double kilometers = (100 * 1.60934);"
        //expression (the data type and ; is not part of expression)
        //kilometers = (100 * 1.60934);

        int highScore = 50;

        if (highScore > 25){
            highScore = 1000 + highScore;       //add bonus points
        }

        int health = 100;
        if ((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }

        //What parts are expressions = 6
        /*
        health = 100
        health < 25
        highScore > 1000
        ((health < 25) && (highScore > 1000)
        highScore = highScore - 1000
        highScore - 1000
         */
    }
}
