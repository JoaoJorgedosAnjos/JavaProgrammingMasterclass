package section06.ControlFLow.codeExercise.ex22;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int i = 1, j = 1, common = 0;

        while (i <= first || i <= second) {
//            if (first % i == 0) {
//                System.out.println("a: " + i);
//            }
//            if (second % j == 0) {
//                System.out.println("b: " + j);
//            }
            if ((first % i == 0) && (second % j == 0)) {
                //System.out.println("a: " + i);
                //System.out.println("b: " + j);
                common = i;
            }

          //  }
            i++;
            j++;
        }

        return common;
    }

//    public static int getGreatestCommonDivisor(int first, int second) {
//        if (first < 10 || second < 10) return -1;
//
//        while (second != 0) {
//            int temp = second;
//            second = first % second;
//            first = temp;
//        }
//
//        return first;
//    }

}

