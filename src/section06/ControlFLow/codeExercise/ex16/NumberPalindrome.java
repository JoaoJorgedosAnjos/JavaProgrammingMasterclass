package section06.ControlFLow.codeExercise.ex16;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(112211));
    }
    public static boolean isPalindrome(int number) {
         // Check for negative numbers and single-digit numbers
            if (number < 0 || (number >= 0 && number < 10)) {
                return true;
            }

            int originalNumber = number;
            int reverse = 0;

            while (number > 0) {
                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number /= 10;
            }

            return originalNumber == reverse;
        }
    }

