package section06.ControlFLow.codeExercise.ex20;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1000,1000,1001));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if ((number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000))
            return false;

        return true;
    }
}
