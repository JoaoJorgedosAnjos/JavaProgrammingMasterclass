package section05.ExpressionsStatementsAndMore.codeExercise.ex08;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(10,20,10));
    }
    public static boolean hasTeen(int ageCheck1, int ageCheck2, int ageCheck3) {
        if ((ageCheck1 >= 13 && ageCheck1 <= 19) || (ageCheck2 >= 13 && ageCheck2 <= 19) || (ageCheck3 >= 13 && ageCheck3 <= 19)) {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int ageCheck){
        if (ageCheck >= 13 && ageCheck <=19)
            return true;
        return false;
    }
}

