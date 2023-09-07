package section06.ControlFLow.codeExercise.ex24;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
        numberToWords(105);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Number");
        int reveserNumber = reverse(number);
        int digitCount = getDigitCount(number);

        for (int i = 1; i <= digitCount; i++) {
            int lastDigit = reveserNumber % 10;
            reveserNumber /= 10;

            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number = -number;
        }
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        return isNegative ? -reverse : reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int count = 0;

        int temporary = number;
        while (temporary >= 0) {
            number = number % 10;
            temporary /= 10;
            count++;
            if (temporary == 0) break;
        }
        return count;
    }
}
