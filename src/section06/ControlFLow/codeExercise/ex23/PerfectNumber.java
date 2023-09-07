package section06.ControlFLow.codeExercise.ex23;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(9));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            //System.out.println(i);
            if (number % i == 0 && i < number) {
                sum += i;
                System.out.println(sum);
            }
        }
        return  (sum == number);
    }
}
