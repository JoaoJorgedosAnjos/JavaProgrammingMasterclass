package section06.ControlFLow.codeExercise.ex28;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 1;
        long avg = 0;
        while (true) {
            //System.out.println("Enter a valid number: ");
            String nextEntry = scanner.nextLine();
            try {
                int validNumber = Integer.parseInt(nextEntry);
                sum += validNumber;
                count++;
                avg = sum /count;

            } catch (NumberFormatException e) {
                break;
            }
        }System.out.println("SUM = " + sum + " AVG = " + avg);

    }
}
/*
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                average = Math.round((double) sum / count);
            } else {
                break;
            }

            scanner.nextLine(); // Clear the input buffer
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}

 */
