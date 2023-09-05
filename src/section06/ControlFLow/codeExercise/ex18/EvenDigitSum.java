package section06.ControlFLow.codeExercise.ex18;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(442));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            if (digit % 2 == 0) {
                sum += digit; // Add even digit to the sum
            }
            number /= 10; // Remove the last digit or number = number / 10;
        }

        System.out.println(sum);
        return 1;
    }
}

/*
Certainly! In the getEvenDigitSum method, the line number /= 10; is used to remove the last digit from the number variable.

Here's an explanation:

The variable number is an integer that represents the input number passed to the method.

Inside the while loop, the code processes the digits of the number one by one, from right to left.

number % 10 is used to get the last digit of the number. The % operator calculates the remainder when number is divided by 10, effectively extracting the last digit.

After processing the last digit, we don't want to include it in the sum again. So, we remove the last digit from the number variable by using number /= 10;.

number /= 10; is a shorthand for number = number / 10;. It divides the current value of number by 10 and assigns the result back to number. This effectively removes the last digit from number, preparing it for the next iteration of the loop to process the next digit.

For example, if number is initially 12345, after number /= 10;, it becomes 1234, then 123, then 12, and so on, until it becomes 0. This process ensures that all digits in the number are processed one by one.

This loop continues until there are no more digits left in number. During each iteration, the last digit is checked to see if it's even, and if it is, it's added to the sum variable. This allows us to calculate the sum of the even digits within the original number.
 */