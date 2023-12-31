package section05.ExpressionsStatementsAndMore.codeExercise.ex05;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1800));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

}
