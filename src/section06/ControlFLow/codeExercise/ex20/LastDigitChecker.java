package section06.ControlFLow.codeExercise.ex20;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(92, 90, 92));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || (!isValid(number2)) || (!isValid(number3))) return false;
        int rightMostDigit1 = number1 % 10;
        int rightMostDigit2 = number2 % 10;
        int rightMostDigit3 = number3 % 10;

        return ((rightMostDigit1 == rightMostDigit2) || (rightMostDigit1 == rightMostDigit3) || (rightMostDigit2 == rightMostDigit3));
    }

//        public static boolean hasSameLastDigit(int number1, int number2, int number3) {
//        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
//            return false;
//        }
//
//        int rightMostDigit1 = number1 % 10;
//        int rightMostDigit2 = number2 % 10;
//        int rightMostDigit3 = number3 % 10;
//
//        if (rightMostDigit1 == rightMostDigit2 || rightMostDigit1 == rightMostDigit3 || rightMostDigit2 == rightMostDigit3) {
//            return true;
//        }
//
//        return false;
 //   }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
