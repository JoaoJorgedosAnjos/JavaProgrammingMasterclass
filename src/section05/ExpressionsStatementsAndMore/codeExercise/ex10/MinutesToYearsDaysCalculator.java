package section05.ExpressionsStatementsAndMore.codeExercise.ex10;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1440);
        printYearsAndDays(527040);
        printYearsAndDays(525600);
        printYearsAndDays(-10);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = minutes / 525600;
            long day = (minutes % 525600) / 1440;
            //System.out.println("year " + year);
            //System.out.println("day " + day);
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }
}
