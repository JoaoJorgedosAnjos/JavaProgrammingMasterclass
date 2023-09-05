package section06.ControlFLow.looping.whileExample.whileLoopChallenge;

public class Main {
    public static void main(String[] args) {
        int number = 4, finishNumber = 20, evenCount = 0, oddCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
        }
        System.out.println("Total odd number found = " + oddCount);
        System.out.println("Total even number found = " + evenCount);

        //OR
       /* while (number <= finishNumber) {
            number++;
            if (isEvenNumber(number)) {
                evenCount++;
                System.out.println(number);
            } else if (!isEvenNumber(number)) {
                oddCount++;
            }
        }
        System.out.println("Total odd number found = " + oddCount);
        System.out.println("Total even number found = " + evenCount);*/
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0) ? true : false;
    }
}
