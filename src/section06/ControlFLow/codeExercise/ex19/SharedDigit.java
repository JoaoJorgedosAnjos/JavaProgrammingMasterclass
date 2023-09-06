package section06.ControlFLow.codeExercise.ex19;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(13, 21));
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) return false;

        int firstDigit1 = 0;
        int lastDigit1 = number1 % 10;
        int firstDigit2 = 0;
        int lastDigit2 = number2 % 10;
        int numCopy = number1, numCopy2 = number2;

        while (numCopy > 0){
                firstDigit1 = numCopy % 10;
                firstDigit2 = numCopy2 % 10;
                numCopy /= 10;
                numCopy2 /=10;
        }
        if (firstDigit1 == firstDigit2 || lastDigit1 == lastDigit2 || lastDigit1 == firstDigit2 || firstDigit1 == lastDigit2)  {
            return true;
        }else return false;
    }
}
