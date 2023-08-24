package section04.InteliijBasics.ifThenStatement;

public class Challenge1 {
    public static void main(String[] args) {
        double myFirstValue = 20.0d, mySecondValue = 80, myValuesTotal, theRemainder;
        boolean isNoRemainder = true;

        myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;

        theRemainder = myFirstValue % 40.00d;

        isNoRemainder = (theRemainder == 0);
        // or
        //isNoRemainder = (theRemainder == 0) ? true : false;

        System.out.println(theRemainder);
        System.out.println(isNoRemainder);

        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }


    }
}
