package section05.ExpressionsStatementsAndMore.methodOverloadingChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingIches) {
        return convertToCentimeters((heightInFeet * 12) + remainingIches);
    }
}
