package section06.ControlFLow.codeExercise.ex17;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit2(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int firtsNumber = 0, lastNumber, sum;

        lastNumber = number % 10;
        while (number >= 10) {
            firtsNumber = number /= 10;
        }
        if (number < 9) {
            sum = lastNumber + lastNumber;
        } else {
            sum = lastNumber + firtsNumber;
        }

        return sum;
    }

    //or
    public static int sumFirstAndLastDigit2(int number) {
        if (number < 0)
            return -1;

        int firstDigit = number % 10;
        int lastDigit = 0;
        int numCopy = number;

        while (numCopy > 0) {
            lastDigit = numCopy % 10;
            numCopy /= 10;
        }

        return firstDigit + lastDigit;
    }
}
