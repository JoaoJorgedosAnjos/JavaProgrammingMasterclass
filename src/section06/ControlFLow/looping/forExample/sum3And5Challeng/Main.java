package section06.ControlFLow.looping.forExample.sum3And5Challeng;

public class Main {
    public static void main(String[] args) {
        int sumOfMatchs = 0, countOfMatches = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sumOfMatchs += i;
                countOfMatches ++;
            }
            if (countOfMatches == 5) break;
        }
        System.out.println("----------");
        System.out.println("the sum of all number that can be diveded by both 3 and 5 is " + sumOfMatchs);
    }
}
