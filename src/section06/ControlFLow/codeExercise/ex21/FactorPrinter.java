package section06.ControlFLow.codeExercise.ex21;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        /*for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }*/
        int j = 1;
        while (j <= number) {
            if (number % j == 0) {
                System.out.println(j);
            }
            j++;
        }
    }
}
