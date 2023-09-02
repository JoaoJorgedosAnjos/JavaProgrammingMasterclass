package section06.ControlFLow.SwithcExpressionChallenge;

public class main {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        System.out.println("-----------------------");
        printDayOfWeek2(0);
        printDayOfWeek2(1);
        printDayOfWeek2(2);
        printDayOfWeek2(3);
        printDayOfWeek2(4);
        printDayOfWeek2(5);
        printDayOfWeek2(6);
        printDayOfWeek2(7);

    }

    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch (day){
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
       };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }
    public static void printDayOfWeek2(int day){
        String dayOfTheWeek = "Invalid Day";
        if (day == 0){
            dayOfTheWeek = "Sunday";
        } else if (day == 1) {
            dayOfTheWeek = "Monday";
        } else if (day == 2) {
            dayOfTheWeek = "Thuesday";
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
        } else if (day == 4 ) {
            dayOfTheWeek = "Thursday";
        } else if (day == 5) {
            dayOfTheWeek = "Friday";
        } else if (day == 6) {
            dayOfTheWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfTheWeek);
    }
}

