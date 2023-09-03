package section06.ControlFLow.codeExercise.ex14;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        /*System.out.println(isLeapYear(0));
        System.out.println(isLeapYear(10000));
        System.out.println(isLeapYear(400));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1800));*/
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999))
            if (year % 4 == 0) {
                if ((year % 100 != 0 || year % 400 == 0)) {
                    return true;
                }
            }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 4, 6, 9, 11:
                    return 30;
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                default:
                    return 0;
            }
        }
        return -1;
    }
   /* public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            if (isLeapYear(year)) {
                return switch (month) {
                    case 1 -> 31;
                    case 2 -> 29;
                    case 3 -> 31;
                    case 4 -> 30;
                    case 5 -> 31;
                    case 6 -> 30;
                    case 7 -> 31;
                    case 8 -> 31;
                    case 9 -> 30;
                    case 10 -> 31;
                    case 11 -> 30;
                    case 12 -> 31;
                    default -> 0;
                };
            } else if (!isLeapYear(month)) {
                return switch (month) {
                    case 1 -> 31;
                    case 2 -> 28;
                    case 3 -> 31;
                    case 4 -> 30;
                    case 5 -> 31;
                    case 6 -> 30;
                    case 7 -> 31;
                    case 8 -> 31;
                    case 9 -> 30;
                    case 10 -> 31;
                    case 11 -> 30;
                    case 12 -> 31;
                    default -> 0;
                };
            }
        }
        return -1;
    }*/
}

