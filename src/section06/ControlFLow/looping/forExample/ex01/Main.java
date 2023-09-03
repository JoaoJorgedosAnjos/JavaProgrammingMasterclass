package section06.ControlFLow.looping.forExample.ex01;

public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        System.out.println("------------------------");

        for (double rate = 2; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
        System.out.println("------------------------");
        for (double i = 7.5; i <= 10; i += 0.25){
            double interestAmount = calculateInterest(100.0, i);
            if (interestAmount > 8.5){
                break;
            }
            System.out.println("100 at " + i + "% interest = $" + interestAmount);
        }

    }

    static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
