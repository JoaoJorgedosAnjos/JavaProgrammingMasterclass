package section05.ExpressionsStatementsAndMore.codeExercise.ex06;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
            // Convert the numbers to integers by multiplying them with 1000
            int intNum1 = (int) (number1 * 1000);
            int intNum2 = (int) (number2 * 1000);

            // Compare the integer representations
            return intNum1 == intNum2;
        }
}
