package section06.ControlFLow.codeExercise.ex26;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1; // Invalid input
        }

        int largestPrime = -1;

        // Check for divisibility by 2
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        // Check for divisibility by odd numbers starting from 3
        for (int i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        // If the remaining number is greater than 2, it is a prime factor
        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }
}
