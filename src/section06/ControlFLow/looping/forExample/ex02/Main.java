package section06.ControlFLow.looping.forExample.ex02;

public class Main {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(2)));
        int primeNumberCounter = 0;
        for (int i = 500; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number!");
                primeNumberCounter++;
            } else if (primeNumberCounter == 3) break;
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
